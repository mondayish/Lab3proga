public class GemStone extends Stone {
    private Gem type;

    GemStone(String name, Planet place, int age, Gem type) {
        super(name, place, age);
        this.type = type;
    }

    Gem getType() {
        return type;
    }

    void setType(Gem type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type.getRussian() + " " + getName() + " стоит на " + getPlace().getRussian() + " уже " + getAge() + " лет";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.hashCode() != obj.hashCode() || this.getClass() != obj.getClass()) {
            return false;
        }
        GemStone gemStone = (GemStone) obj;
        return getName().equals(gemStone.getName()) && getAge() == gemStone.getAge() && getPlace() == gemStone.getPlace() && type == gemStone.type;
    }

    @Override
    public int hashCode() {
        return getName().hashCode() + getPlace().hashCode() + type.hashCode();
    }

    //сверкать
    String sparkle() {
        return getName() + " сверкает. Место: " + getPlace().getRussian();
    }
}
