import java.util.*;
public class Shelter {
    private List<Pet> pets = new ArrayList<>();
    public void addPet(Pet pet) {
        pets.add(pet);
    }
    public void displayAllPets() {
        pets.forEach(System.out::println);
    }
    public void sortPetsByAge() {
        pets.sort(Comparator.comparingInt(Pet::getAge));
    }
}
