public class Person {
    private String name;

    public Person() {
        this.name = "";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object otherPerson) {
        if (otherPerson instanceof Person) {
            Person person = (Person) otherPerson;
            return this.name.equals(person.getName());
        }
        return false;
    }
}
