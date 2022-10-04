package hw1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String temperature;

        System.out.println("What is the weather today?");

        temperature = input.next();

        if(temperature.equalsIgnoreCase("High")){
            System.out.println("Sunblock may be needed");
        }else if(temperature.equalsIgnoreCase("Low")){
            System.out.println("A coat Hmay be needed");
        }else if(temperature.equalsIgnoreCase("Humid")){
            System.out.println("It's muggy");
        }
    }
}
