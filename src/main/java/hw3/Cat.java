package hw3;

public class Cat extends Pets{
    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void consume() {
        System.out.println(getName()+ " eats a fish");
    }
}

