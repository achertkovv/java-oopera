/**
 * Человек
 */
public class Person {
    private final String name; // имя
    private final String surname; // фамилия
    private final Gender gender; // пол

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() { return gender; }

    @Override
    public String toString() {
        return name + ' ' + surname;
    }
}
