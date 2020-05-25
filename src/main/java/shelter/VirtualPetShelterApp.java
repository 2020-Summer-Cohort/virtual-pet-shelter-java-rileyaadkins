package shelter;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelterApp {

    Map<String, VirtualPet> pets = new HashMap<>();

    public VirtualPetShelterApp() {
    }

    public void addPet(String name, VirtualPet pet) {
        pets.put(name, pet);
    }

    public void petNames() {
        for (Map.Entry<String, VirtualPet> entry : pets.entrySet())
            System.out.println(entry.getKey() + ": " + entry.getValue().getDescription());
    }

    public void removePet(String name) {
        pets.remove(name);
    }

    public void feedAllPets() {
        for (VirtualPet pet : pets.values())
            pet.feed();
    }

    public void cuddleAllPets() {
        for (VirtualPet pet : pets.values())
            pet.cuddlePets();
    }

    public void playWithPet(String name) {
        for (String petName : pets.keySet()) {
            if (petName.equalsIgnoreCase(name)) {
                pets.get(petName).cuddlePets();
                System.out.println("You Played With " + petName);
            }
        }
    }


    public Collection<VirtualPet> showPets() {
        return pets.values();
    }

    public void tick() {
        for (VirtualPet pet : pets.values()) ;

    }
}
















