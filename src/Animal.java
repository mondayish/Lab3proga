public class Animal extends Alive implements Rest {
    private Color color;
    private int power;
    static final int MAX_POWER=3;
    static final int MIN_POWER=0;

<<<<<<< HEAD
    Animal(String name, Planet place, int energy, Color color, int power) {
=======
    Animal(String name, Planet place, int energy, Color color) {
>>>>>>> e5162eea88d66c50141dadce2aaf89ccb07e6145
        super(name, place, energy);
        this.color = color;
        setPower(power);
    }

    void setPower(int power) {
        if (power > MAX_ENERGY) this.power = MAX_POWER;
        else if (power < MIN_POWER) this.power = MIN_POWER;
        else this.power = power;
    }

    int getPower() {
        return power;
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
<<<<<<< HEAD
        return getName().equals(animal.getName()) && getPlace() == animal.getPlace() &&
                color == animal.color && animal.getCondition() == getCondition() && getEnergy() == animal.getEnergy();
=======
        return getName().equals(animal.getName()) && getPlace() == animal.getPlace() && color == animal.color && animal.getCondition() == getCondition() && getEnergy() == animal.getEnergy();
>>>>>>> e5162eea88d66c50141dadce2aaf89ccb07e6145
    }

    @Override
    public int hashCode() {
        return color.hashCode() + getName().hashCode() + getPlace().hashCode() + getCondition().hashCode();
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "Animal " + getName() + ", цвет: " + color.getRussian() + ", находиться на " + getPlace().getRussian() +
                ". Состояние: " + getCondition().getRussian() + ". Энергия: " + getEnergy();
=======
        return "Animal " + getName() + ", цвет: " + color.getRussian() + ", находиться на " + getPlace().getRussian() + ". Состояние: " + getCondition().getRussian() + ". Энергия: " + getEnergy();
>>>>>>> e5162eea88d66c50141dadce2aaf89ccb07e6145
    }
}
