public class Person extends Alive implements Rest, Philosophy {
    private int attention;
    private String[] clothes;
    private boolean dressed;

    Person(String name, Planet place, int energy, int attention, String... clothes) {
        super(name, place, energy);
        setAttention(attention);
        setClothes(clothes);
    }

    int getAttention() {
        return attention;
    }

    void setAttention(int attention) {
        if (attention < 0 || attention > 5) this.attention = (int) (Math.random() * 5);
        else this.attention = attention;
    }

    String[] getClothes() {
        return clothes;
    }

    void setClothes(String... clothes) {
        this.clothes = deleteDublClothes(clothes);
    }

    private String[] deleteDublClothes(String clothes[]) {
        //удаление дубликатов
        boolean deleteIndex[] = new boolean[clothes.length];
        for (int i = 0; i < clothes.length; i++) {
            for (int j = i + 1; j < clothes.length; j++) {
                if (clothes[i].equals(clothes[j])) deleteIndex[i] = true;
            }
        }
        int size = 0;
        for (boolean i : deleteIndex) if (!i) size++;
        String normalClothes[] = new String[size];
        int count = 0;
        for (int i = 0; i < clothes.length; i++) if (!deleteIndex[i]) normalClothes[count++] = clothes[i];
        return normalClothes;
    }

    Person(String name) {
        super(name, Planet.EARTH, (int) (Math.random() * 10));
        setAttention(-1);
    }

    @Override
    void tell(String phrase) {
        System.out.println(getName() + " говорит: \"" + phrase + "\"");
    }

    @Override
    public void rest() {
        System.out.println(getName() + " отдыхает. Место: " + getPlace().getRussian());
        setCondition(Condition.REST);
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " спит. Место: " + getPlace().getRussian());
        setCondition(Condition.SLEEP);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.hashCode() != obj.hashCode() || this.getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        if (person.clothes.length == clothes.length) {
            for (int i = 0; i < clothes.length; i++) {
                if (!clothes[i].equals(person.clothes[i])) {
                    return false;
                }
            }
        }
        return getName().equals(person.getName()) && getPlace() == person.getPlace() && person.clothes.length == clothes.length && person.getCondition() == getCondition() && getEnergy() == person.getEnergy();
    }

    @Override
    public int hashCode() {
        return getName().hashCode() + getPlace().hashCode() + getCondition().hashCode();
    }

    @Override
    public String toString() {
        String dress = "";
        if (clothes != null) {
            for (String i : clothes) {
                dress += i + ", ";
            }
            dress = dress.substring(0, dress.length() - 2);
        } else dress = "без одежды";
        String dressedStr="не одет";
        if(dressed) dressedStr="одет";
        return "Person " + getName() + " находиться на " + getPlace().getRussian() + ". Состояние: " + getCondition().getRussian() + ", " + dressedStr + ". Одежда: " + dress + ". Энергия: " + getEnergy();
    }

    void sigh() {
        if (getEnergy() < 3) System.out.println(getName() + " вздохнул");
        else System.out.println(getName() + " ещё полон энергии");
    }

    @Override
    public void notice(GemStone gemStone) {
        if (gemStone.getSpark() && attention * gemStone.getSize() / (Math.abs(this.getPlace().getNumber_to_sun() - gemStone.getPlace().getNumber_to_sun())) > 100) {
            System.out.println(getName() + " заметил, что " + gemStone.getName() + " сверкает");
            setCondition(Condition.NOTICE);
        } else System.out.println(getName() + " ничего не замечает");
    }

    @Override
    public void think(Thing obj) {
        System.out.println(getName() + " думает о " + obj.getName());
        setCondition(Condition.THINK);
    }

    void get_dressed() {
        if (clothes != null) {
            if (!dressed) {
                String result = getName() + " надевает ";
                for (String i : clothes) {
                    result += i + ", ";
                }
                result = result.substring(0, result.length() - 2);
                System.out.println(result);
                dressed = true;
            } else {
                System.out.println(getName() + " раздевается");
                dressed = false;
            }
        } else {
            this.tell("Мне нечего надеть");
        }
    }

    void stand() {
        System.out.println(getName() + " встал");
        setCondition(Condition.STAND);
    }
}
