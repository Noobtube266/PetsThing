package hw2;

public class Dog extends Pets {

    public Dog(){
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName()+ " goes Bark Bork");
    }

}
