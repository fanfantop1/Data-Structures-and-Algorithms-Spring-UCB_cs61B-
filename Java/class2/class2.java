class Dog {

    int age;

    Dog(int a) {
        age = a;
    }

    void bark() {
        if (age > 5) {
            IO.println("Woof");
        } else if (age > 2) {
            IO.println("Ruff");
        } else {
            IO.println("Yip");
        }
    }

    Dog maxdog(Dog otherDog) {
        if (this.age > otherDog.age) {
            return this;
        } else {
            return otherDog;
        }

    }


    static Dog maxdog(Dog d1, Dog d2) {
        if (d1.age > d2.age) {
            return d1;
        } else {
            return d2;
        }
    }

}



void main() {
    Dog d1 = new Dog(3);
    Dog d2 = new Dog(6);
    d1.bark();
    d2.bark();

}