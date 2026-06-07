import java.util.Objects;

/**
 * Актёр
 */
public class Actor extends Person {
    private final int height; // рост

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Актер " + getSurname() +
                " " + getName() +
                " (рост=" + height + ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return height == actor.height &&
                Objects.equals(this.getName(), actor.getName()) &&
                Objects.equals(this.getSurname(), actor.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, this.getName(), this.getSurname());
    }
}
