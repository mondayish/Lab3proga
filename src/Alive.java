abstract class Alive extends Thing {
    private Condition condition;

    Alive(String name, Planet place) {
        super(name, place);
        this.condition = Condition.NOTHING;
    }

    void setCondition(Condition condition) {
        this.condition = condition;
    }

    Condition getCondition() {
        return condition;
    }

    void goTo(Planet place) {
        setPlace(place);
        setCondition(Condition.NOTHING);
        System.out.println(getName() + " перемещается на " + getPlace().getRussian());
    }

    abstract void tell(String phrase);
}
