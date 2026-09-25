class dog {

    int age;

    dog(int a) {
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

}

void main() {
    dog d1 = new dog(3);
    dog d2 = new dog(6);
    d1.bark();
    d2.bark();

}