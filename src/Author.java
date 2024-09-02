public class Author {

    public String toString() {
        return name + " " + surname;
    }

    private String name;
    private String surname;


    public Author(String name, String surnames) {
        this.name = name;
        this.surname = surnames;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

}
