package hw2;

import java.util.Scanner;

public class Pets {
    Scanner input = new Scanner(System.in);
    private String name;
    public Pets(){

    }
    public Pets(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(){
        System.out.println("Enter name");
        name = input.nextLine();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak(){
        System.out.println(name + "Is making noise");
    }


    public void consume() {
    }
}
