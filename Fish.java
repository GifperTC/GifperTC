public class Fish extends Animal {
    /** Id number of the Animal */
    private long id;
    /** Id number of the Animal */
    private static long nxtId = 1;

    public Fish(String name) {
        super(name);
        this.id = Fish.nxtId;
        Fish.nxtId++;
    }

    public String toString() {
        return String.format("Name %s : Fish ID %d", super.getName(), this.id);
    }
}