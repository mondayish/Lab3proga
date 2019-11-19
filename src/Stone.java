abstract class Stone extends Thing {
    private int age;

    Stone(String name, Planet place, int age) {
        super(name, place);
        setAge(age);
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}
