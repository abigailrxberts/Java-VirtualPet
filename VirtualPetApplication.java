import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        VirtualPet Rosie = new VirtualPet("Rosie", 50, 50, 50);
        
        Scanner scanner = new Scanner(System.in);
        String choice = "";

        System.out.println("\nWelcome to Virtual Pet!");
        System.out.println("Rosie the Cat will find a new owner if her hunger, thirst, or boredom reaches 100!");
        System.out.println("Rosie starts with 50 hunger, thirst, and boredom. Be careful!");
        System.out.println("Have fun with your new pet!\n");

        while (!choice.equalsIgnoreCase("6")) {
            displayMenu();
            choice = scanner.nextLine();
            if (choice.equals("1")) {
                feed(Rosie);
            } else if (choice.equals("2")) {
                play(Rosie);
            } else if (choice.equals("3")) {
                giveWater(Rosie);
            } else if (choice.equals("4")) {
                doNothing(Rosie);
            } else if (choice.equals("5")) {
                displayAttributes();
            } else if (choice.equals("6")) {
                break;
            }else {
                break;
            }
        }
    }

    static VirtualPet Rosie = new VirtualPet("Rosie", 50, 50, 50);

    private static void displayMenu() {
        System.out.println("1. Feed Rosie!");
        System.out.println("2. Play With Rosie!");
        System.out.println("3. Give Water to Rosie!");
        System.out.println("4. Do Nothing With Rosie!");
        System.out.println("5. Display Rosie's Hunger, thirst, and Boredom levels.");
        System.out.println("6. Exit Game");
    }


    private static void feed(VirtualPet Rosie) {
        Rosie.feed();
        System.out.println("\nYou have fed Rosie!\n");
        System.out.println("Rosie's new hunger level is: " + Rosie.getHunger());
        System.out.println("Rosie's new thirst level is: " + Rosie.getThirst());
    }

    private static void play(VirtualPet Rosie) {
        Rosie.play();
        System.out.println("\nYou played with Rosie!\n");
        System.out.println("Rosie's new thirst level is: " + Rosie.getThirst());
    }

    private static void giveWater(VirtualPet Rosie) {
        Rosie.giveWater();
        System.out.println("\nYou gave water to Rosie!\n");
    }

    private static void doNothing(VirtualPet Rosie) {
        Rosie.tick();
        System.out.println("\nYou did nothing with Rosie. She is very sad.\n");
    }

    private static void displayAttributes() {
        System.out.println("\nHere are Rosie's attributes:\n");
        System.out.println("Hunger: " + Rosie.getHunger());
        System.out.println("Thirst: " + Rosie.getThirst());
        System.out.println("Boredom: " + Rosie.getBoredom() + "\n");
    }
}

