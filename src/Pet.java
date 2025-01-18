public class Pet extends Animal {
    private String breed;
    public Pet(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    @Override
    public String toString() {
        return super.toString() + ", a " + breed;
    }
}
