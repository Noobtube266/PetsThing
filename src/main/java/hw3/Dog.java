package hw3;

public class Dog extends Pets{
    public Dog(){
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void consume() {
        System.out.println(getName()+ " eats steak");
    }
}
