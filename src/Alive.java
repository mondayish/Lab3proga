abstract class Alive extends Thing {
    private Condition condition;
    private int energy;

    Alive(String name, Planet place, int energy) {
        super(name, place);
        this.condition = Condition.NOTHING;
        if (energy > 10) this.energy = 10;
        else if (energy < 0) this.energy = 0;
        else this.energy = energy;
    }

    void setCondition(Condition condition) {
        switch (condition) {
            case SLEEP:
                addEnergy(3);
                break;
            case REST:
                addEnergy(1);
                break;
            case STAND:
            case NOTICE:
            case THINK:
                subEnergy(1);
        }
        checkEnergy();
        this.condition = condition;
    }

    private void checkEnergy() {
        if (energy > 10) energy = 10;
    }

    private void subEnergy(int need) {
        if (energy < need) System.out.println(getName() + " устал. Нужно отдохнуть");
        else {
            energy -= need;
            System.out.println(getName() + " теряет " + need + " энергии");
        }
    }

    private void addEnergy(int add) {
        if (energy == 10) System.out.println(getName() + " полон энергии не хочет отдыхать");
        else {
            energy += add;
            System.out.println(getName() + " восстанавливает " + add + " энергии");
        }
    }

    Condition getCondition() {
        return condition;
    }

    int getEnergy() {
        return energy;
    }

    void goTo(Planet place) {
        if (condition == Condition.SLEEP || condition == Condition.REST)
            setCondition(Condition.STAND);
        if (energy > 2) {
            setPlace(place);
            setCondition(Condition.NOTHING);
            System.out.println(getName() + " перемещается на " + getPlace().getRussian());
        }
        subEnergy(3);
    }

    abstract void tell(String phrase);
}
