import java.util.Objects;

public class Author {

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(surname, author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
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
