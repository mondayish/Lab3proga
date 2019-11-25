public class Animal extends Alive implements Rest {
    private Color color;

    Animal(String name, Planet place, int energy, Color color) {
        super(name, place, energy);
        this.color = color;
    }

    Color getColor() {
        return color;
    }

    void setColor(Color color) {
        this.color = color;
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
    void tell(String phrase) {
        System.out.println(getName() + " говорит: \"" + phrase + "\"");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.hashCode() != obj.hashCode() || this.getClass() != obj.getClass()) {
            return false;
        }
        Animal animal = (Animal) obj;
        return getName().equals(animal.getName()) && getPlace() == animal.getPlace() && color == animal.color && animal.getCondition() == getCondition() && getEnergy() == animal.getEnergy();
    }

    @Override
    public int hashCode() {
        return color.hashCode() + getName().hashCode() + getPlace().hashCode() + getCondition().hashCode();
    }

    @Override
    public String toString() {
        return "Animal " + getName() + ", цвет: " + color.getRussian() + ", находиться на " + getPlace().getRussian() + ". Состояние: " + getCondition().getRussian() + ". Энергия: " + getEnergy();
    }
}
