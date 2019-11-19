public class Person extends Alive implements Rest, Philosophy {
    private String[] clothes;

    Person(String name, Planet place, String... clothes) {
        super(name, place);
        this.clothes = clothes;
    }

    String[] getClothes() {
        return clothes;
    }

    void setClothes(String... clothes) {
        this.clothes = clothes;
    }

    Person(String name) {
        super(name, Planet.EARTH);
    }

    @Override
    void tell(String phrase) {
        System.out.println(getName() + " говорит: \"" + phrase + "\"");
    }

    @Override
    public void rest() {
        setCondition(Condition.REST);
        System.out.println(getName() + " отдыхает. Место: " + getPlace().getRussian());
    }

    @Override
    public void sleep() {
        setCondition(Condition.SLEEP);
        System.out.println(getName() + " спит. Место: " + getPlace().getRussian());
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
        return getName().equals(person.getName()) && getPlace() == person.getPlace() && person.clothes.length == clothes.length && person.getCondition() == getCondition();
    }

    @Override
    public int hashCode() {
        return getName().hashCode() + getPlace().hashCode() + getCondition().hashCode();
    }

    @Override
    public String toString() {
        return "Person " + getName() + " находиться на " + getPlace().getRussian() + ". Состояние: " + getCondition().getRussian();
    }

    @Override
    public void sigh() {
        System.out.println(getName() + " вздохнул");
    }

    @Override
    public void notice(String thing) {
        setCondition(Condition.NOTICE);
        System.out.println(getName() + " заметил, что " + thing);
    }

    @Override
    public void think(Thing obj) {
        setCondition(Condition.THINK);
        System.out.println(getName() + " думает о " + obj.getName());
    }

    void get_dressed() {
        if (clothes != null) {
            String result = getName() + " надевает ";
            for (String i : clothes) {
                result += i + ", ";
            }
            result = result.substring(0, result.length() - 2);
            System.out.println(result);
        } else {
            this.tell("Мне нечего надеть");
        }
    }

    void stand() {
        setCondition(Condition.STAND);
        System.out.println(getName() + " встал");
    }
}
