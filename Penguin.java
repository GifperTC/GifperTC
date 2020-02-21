public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    public String toString() {
        return String.format("Name %s : Bird-Penguin ID %d", super.getName(), super.getId());
    }
}