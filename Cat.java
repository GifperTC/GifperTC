public class Cat extends Animal {
    /** Id number of the Animal */
    private long id;
    /** Id number of the Animal */
    private static long nxtId = 1;

    public Cat(String name) {
        super(name);
        this.id = Cat.nxtId;
        Cat.nxtId++;
    }

    public String toString() {
        return String.format("Name %s : Cat ID %d", super.getName(), this.id);
    }
}