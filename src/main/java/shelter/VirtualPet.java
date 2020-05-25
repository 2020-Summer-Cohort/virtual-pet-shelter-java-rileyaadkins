package shelter;


import java.util.Random;

public class VirtualPet {

    Random random = new Random();

    private int hunger;
    private int potty;
    private int cuddle;
    private String name;
    private String description;

    public VirtualPet(String name, String description) {
        this.name = name;
        this.description = description;
        hunger = random.nextInt(20);
        potty = random.nextInt(20);
        cuddle = random.nextInt(20);
    }

    public VirtualPet(String name, String description, int hunger, int potty, int cuddle) {
        this.name = name;
        this.description = description;
        this.hunger = hunger;
        this.potty = potty;
        this.cuddle = cuddle;
    }

    public VirtualPet() { }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getHunger() {
        return hunger;
    }

    public int getPotty() {
        return potty;
    }

    public int getCuddles() {
        return cuddle;
    }

    public void feed() {
        hunger -= 2;
    }

    public void cuddlePets() {
        cuddle += 3;
    }

    public void tick() {
        hunger += 1;
        potty += 1;
        cuddle -= 3;

    }
}




