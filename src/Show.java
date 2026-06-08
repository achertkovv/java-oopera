import java.util.ArrayList;

/**
 * Спектакль
 */
public class Show {
    private final String title; // название
    private final int duration; // длительность в минутах
    private final Director director; // режиссёр
    private final ArrayList<Actor> listOfActors; // список актёров

    public Show(String title,
                int duration,
                Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    // Распечатать список всех актеров
    public void printListOfActors() {
        System.out.println("Список актеров в спектакле \"" + title + "\"");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    // Добавить нового актера в спектакль
    public void addNewActorToShow(Actor newActor) {
        // При добавлении актёра должна быть проверка, нет ли уже такого актёра среди добавленных
        for (Actor actor : listOfActors) {
            if (actor.equals(newActor)) {
                System.out.println(actor + " уже есть в списке");
                return;
            }
        }
        // Метод должен добавлять актёра в список listOfActors
        listOfActors.add(newActor);
        System.out.println(newActor + " добавлен в список");
    }

    // Заменить одного актёра в спектакле на другого
    // (на вход подаётся объект нового актёра и фамилия того, которого он заменяет)
    public void replaceActorInShow(Actor newActor, String oldActorSurname) {
        // Устранение замечания: не проверяет, есть ли уже такой актер в спектакле
        for (Actor actor : listOfActors) {
            if (actor.equals(newActor)) {
                System.out.println(actor + " уже есть в списке");
                return;
            }
        }
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor actor = listOfActors.get(i);
            if (actor.getSurname().equals(oldActorSurname)) {
                listOfActors.set(i, newActor);
                return;
            }
        }
        // Если актёр с такой фамилией отсутствует, должно выводиться предупреждающее сообщение.
        System.out.println("Актер с фамилией \"" + oldActorSurname + "\" не найден!");
    }

    public Director getDirector() {
        return director;
    }

    public String getTitle() {
        return "Спектакль \"" + title + "\""
                + ". Длительность: " + duration + " мин.";
    }
}
