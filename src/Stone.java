abstract class Stone extends Thing {
    private int age;
    private int size;

    Stone(String name, Planet place, int age, int size) {
        super(name, place);
        setAge(age);
        setSize(size);
    }

    int getSize() {
        return size;
    }

    void setSize(int size) {
        if (size < 0 || size > 100) this.size = (int) (Math.random() * 100);
        else this.size = size;
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
