package hw2;

public class Pig extends Pets{

    public Pig() {
    }

    public Pig(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName()+ " goes Oink Spoink");
    }
}
