public class Bird extends Animal {
    /** Id number of the Animal */
    private long id;
    /** Id number of the Animal */
    private static long nxtId = 1;

    public Bird(String name) {
        super(name);
        this.id = Bird.nxtId;
        Bird.nxtId++;
    }

    public String toString() {
        return String.format("Name %s : Bird ID %d", super.getName(), this.id);
    }
}