package shelter;


import java.util.Collection;
import java.util.Scanner;

public class VirtualPetApplication {
    private static VirtualPetShelterApp shelter = new VirtualPetShelterApp();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        welcomeMessage();
        creatPets();
        showPets();
        gameLoop();
    }

    private static void welcomeMessage() {
        System.out.println("Welcome to The Sanrio Virtual Shelter!");
        System.out.println("             龴ↀ◡ↀ龴");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Press ENTER to Start.");
        input.nextLine();
    }

    private static void creatPets() {
        shelter.addPet("Hello Kitty", new VirtualPet("Hello Kitty", "The Cutest Cat!"));
        shelter.addPet("Badtz-Maru", new VirtualPet("Badtz-Maru", "The Cuddly Bat!"));
        shelter.addPet("Keroppi", new VirtualPet("Keroppi", "The Friendly Frog!"));
        shelter.addPet("Choccat", new VirtualPet("Chococat", "The Shy Cat!"));
    }

    private static void showPets() {
        Collection<VirtualPet> pets = shelter.showPets();
        for (VirtualPet pet : pets)
            System.out.println(pet.getName() + "\n" +
                    "\t Hunger: " + pet.getHunger() +
                    "\t Potty: " + pet.getPotty() +
                    "\t Cuddles: " + pet.getCuddles());
    }

    private static void gameActions() {
        System.out.println("What would you like to do next?");
        System.out.println();
        System.out.println("[1] Feed All Pets");
        System.out.println("[2] Cuddle All Pets");
        System.out.println("[3] Pick An Individual Pet To Play With");
        System.out.println("[4] ♥ Adopt A Pet! ♥");
        System.out.println("[5] Admit A Pet To The Sanrio Shelter");
        System.out.println("[6] Exit The Sanrio Virtual Shelter");

        int userChoice = input.nextInt();
        input.nextLine();

        switch (userChoice) {
            case 1:
                shelter.feedAllPets();
                showPets();
                break;
            case 2:
                shelter.cuddleAllPets();
                showPets();
                break;
            case 3:
                pickAPet();
                break;
            case 4:
                adoptAPet();
                break;
            case 5:
                admitAPet();
                break;
            case 6:
                System.out.println("♥ Thanks For Visiting The Sanrio Virtual Pet Shelter! ♥");
                System.exit(0);
        }
    }


    private static void petNames() {
        shelter.petNames();
    }

    private static void pickAPet() {
        System.out.println("Who would you like to play with?");
        petNames();
        String answer = input.nextLine();
        shelter.playWithPet(answer);
    }

    private static void adoptAPet() {
        System.out.println("Who would you like to adopt?");
        petNames();
        String answer = input.nextLine();
        System.out.println("You chose " + answer + "!");
        System.out.println();
        shelter.removePet(answer);

    }

    private static void admitAPet() {
        System.out.println("Please type the name of the pet you'd like to admit");
        String name = input.nextLine();
        shelter.addPet(name, new VirtualPet());
    }

    private static void gameLoop() {
        while (true) {
            gameActions();
            shelter.tick();


        }
    }
}


