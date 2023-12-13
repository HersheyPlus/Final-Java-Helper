package people;

public class Person {
    private static int nextId = 0;
    private final int id;
    private final String name;

    public Person(String name) {
        this.id = ++nextId;
        this.name = name;
    }
    @Override public String toString() {
        return String.format("Person(%d,%s)", id,name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
