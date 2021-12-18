package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is not Siri.");
        System.out.println("I was created in shitty year 2021.");
        System.out.println("Please, remind me your name.");

        String yourName = scanner.nextLine();

        System.out.println("What a great name you have, " + yourName + "!");
    }
}