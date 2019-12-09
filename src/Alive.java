abstract class Alive extends Thing {
    private Condition condition;
    private int energy;
<<<<<<< HEAD
    final static int MAX_ENERGY = 10;
    final static int MIN_ENERGY = 0;
=======
>>>>>>> e5162eea88d66c50141dadce2aaf89ccb07e6145

    Alive(String name, Planet place, int energy) {
        super(name, place);
        this.condition = Condition.NOTHING;
<<<<<<< HEAD
        if (energy > MAX_ENERGY) this.energy = MAX_ENERGY;
        else if (energy < MIN_ENERGY) this.energy = MIN_ENERGY;   //выравнивание энергии по максимальному и минимальному значению
=======
        if (energy > 10) this.energy = 10;
        else if (energy < 0) this.energy = 0;
>>>>>>> e5162eea88d66c50141dadce2aaf89ccb07e6145
        else this.energy = energy;
    }

    //метод устанавливает состояние и в зав-ти от состояния тратит или поополняет энергию
    void setCondition(Condition condition) {
        switch (condition) {
            case SLEEP:
                addEnergy(3);
                break;
            case REST:
                addEnergy(1);
                break;
<<<<<<< HEAD
            case IN_ARRIVE:
                subEnergy(energy);        //при путешествии тратится вся энергия
                break;
=======
>>>>>>> e5162eea88d66c50141dadce2aaf89ccb07e6145
            case STAND:
            case NOTICE:
            case THINK:
                subEnergy(1);
        }
        checkEnergy();
        this.condition = condition;
    }

<<<<<<< HEAD
    //метод выравнивает энергию по максимальному значению, если она больше его
    private void checkEnergy() {
        if (energy > MAX_ENERGY) energy = MAX_ENERGY;
    }

    //метод тратит энергию, если её достаточно
=======
    private void checkEnergy() {
        if (energy > 10) energy = 10;
    }

>>>>>>> e5162eea88d66c50141dadce2aaf89ccb07e6145
    private void subEnergy(int need) {
        if (energy < need) System.out.println(getName() + " устал. Нужно отдохнуть");
        else {
            energy -= need;
            System.out.println(getName() + " теряет " + need + " энергии");
        }
    }

<<<<<<< HEAD
    //метод пополняет энергию
    private void addEnergy(int add) {
        if (energy == MAX_ENERGY) System.out.println(getName() + " полон энергии и не хочет отдыхать");
=======
    private void addEnergy(int add) {
        if (energy == 10) System.out.println(getName() + " полон энергии не хочет отдыхать");
>>>>>>> e5162eea88d66c50141dadce2aaf89ccb07e6145
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

<<<<<<< HEAD
    //метод позволяет переместиться на другую планету
    void goTo(Planet place) {
        //если сущ-во уже на этой планете, то перемещения не будет
        if (place == getPlace()) {
            System.out.println(getName() + " уже находится на планете " + place.getRussian());
            return;
        }
        //если сущ-во готовится к путешествию, то перемещения также не будет
        if(condition==Condition.SIT_ON_ANIMAL || condition==Condition.READY_FOR_ARRIVE){
            System.out.println(getName()+" гтовиться к путешествию, он не может переместиться на "+place);
            return;
        }
        if (condition == Condition.SLEEP || condition == Condition.REST)  //если сущ-во отдыхало, то для начала нужно встать
=======
    void goTo(Planet place) {
        if (condition == Condition.SLEEP || condition == Condition.REST)
>>>>>>> e5162eea88d66c50141dadce2aaf89ccb07e6145
            setCondition(Condition.STAND);
        if (energy > 2) {
            setPlace(place);
            setCondition(Condition.NOTHING);
            System.out.println(getName() + " перемещается на " + getPlace().getRussian());
        }
        subEnergy(3);
<<<<<<< HEAD
    }

    void stand() {
        if(getCondition()==Condition.SIT_ON_ANIMAL){
            System.out.println("Person "+getName()+" не может встать, т.к. сидит на животном");
            return;
        }
        System.out.println(getName() + " встаёт");
        setCondition(Condition.STAND);
=======
>>>>>>> e5162eea88d66c50141dadce2aaf89ccb07e6145
    }

    abstract void tell(String phrase);
}
