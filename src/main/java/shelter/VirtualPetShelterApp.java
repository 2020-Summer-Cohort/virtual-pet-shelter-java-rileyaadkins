package shelter;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
 *  Here are the changes we would like to see for this to move into passing:
 *  - Rename this class to VirtualPetShelter, it took me a hot minute to figure out why there wasn't a main() method in
 *    this class and what was going on.
 *  - In line 46, I would like to see the System.out.println() moved to the Application class.
 *  - The tick method iterates over the collection of pets, but doesn't do anything else.  Add a call to each pet's
 *    tick() method to complete the behavior of this class's tick() method
 *  Other than these changes, this class looks remarkably clean and simple.  It was really close to mark this as passing,
 *  but these changes are small and will make this application 10x better for your portfolio of projects.  Good job!
 */
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
















