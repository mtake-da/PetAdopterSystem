public class Main {
    public static void main(String[] args) {
        Shelter shelter = new Shelter();

        Pet pet1 = new Pet("Barsik", 3, "Golden Retriever");
        Pet pet2 = new Pet("Rysik", 2, "Husky");

        shelter.addPet(pet1);
        shelter.addPet(pet2);

        System.out.println("Meet our lovely pets:");
        shelter.displayAllPets();

        System.out.println("\nSorted by age:");
        shelter.sortPetsByAge();
        shelter.displayAllPets();
    }
}
