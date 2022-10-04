package hw3;

public class Pig extends Pets{
    public Pig() {
    }

    public Pig(String name) {
        super(name);
    }

    @Override
    public void consume() {
        System.out.println(getName()+ " eats whatever");
    }
}
