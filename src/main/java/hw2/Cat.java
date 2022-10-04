package hw2;

public class Cat extends Pets{

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName()+ " goes Meow Mew");
    }
}
