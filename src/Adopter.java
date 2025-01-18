public class Adopter {
    private String name;
    private int adopterId;
    public Adopter(String name, int adopterId) {
        this.name = name;
        this.adopterId = adopterId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAdopterId() {
        return adopterId;
    }
    public void setAdopterId(int adopterId) {
        this.adopterId = adopterId;
    }
    @Override
    public String toString() {
        return "Adopter: " + name + " (ID: " + adopterId + ")";
    }
}
