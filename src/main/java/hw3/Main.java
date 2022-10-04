package hw3;

import hw2.Cat;
import hw2.Dog;
import hw2.Pets;
import hw2.Pig;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numbPets;

        System.out.println("How many pets do you want to feed");

        numbPets = input.nextInt();

        input.skip(System.lineSeparator());

        Pets[] petList = new Pets[numbPets];
        for (int i = 0; i < petList.length; i++) {
            System.out.println("What type of pet is animal #" + (i+1) + "?");
            String petType = input.nextLine();
            if (petType.equalsIgnoreCase("Dog")) {
                petList[i] = new Dog();
            } else if (petType.equalsIgnoreCase("Cat")) {
                petList[i] = new Cat();
            } else if (petType.equalsIgnoreCase("Pig")) {
                petList[i] = new Pig();
            } else {
                petList[i] = new Pets();
            }
        }
        for (int i = 0; i < petList.length; i++) {
            System.out.print("Pet #" + (i + 1) + ": ");
            petList[i].consume();
        }
    }
}
