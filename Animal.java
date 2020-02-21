public class Animal {
    /** Animal name */
    private String name;
    /** Id number of the Animal */
    private long id;
    /** Id number of the Animal */
    private static long nxtId = 1;

    public Animal(String name) {
        this.name = name;
        this.id = Animal.nxtId;
        Animal.nxtId++;
    }

    public String getName() {
        return this.name;
    }

    public Long getId() {
        return this.id;
    }

    public String toString() {
        return String.format("%s : %d", this.name, this.id);
    }
}