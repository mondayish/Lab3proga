abstract class Stone extends Thing {
    private int age;
    private int size;
<<<<<<< HEAD
    final static int MAX_SIZE=100;
    final static int MIN_SIZE=0;
=======
>>>>>>> e5162eea88d66c50141dadce2aaf89ccb07e6145

    Stone(String name, Planet place, int age, int size) {
        super(name, place);
        setAge(age);
        setSize(size);
    }

    int getSize() {
        return size;
    }

    void setSize(int size) {
<<<<<<< HEAD
        if (size < MIN_SIZE || size > MAX_SIZE) this.size = (int) (Math.random() * MAX_SIZE);
=======
        if (size < 0 || size > 100) this.size = (int) (Math.random() * 100);
>>>>>>> e5162eea88d66c50141dadce2aaf89ccb07e6145
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
