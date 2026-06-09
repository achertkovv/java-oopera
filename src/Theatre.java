public class Theatre {
    public static void main(String[] args) {
        // Создать трёх актеров и двух режиссёров.
        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 180);
        Actor actor2 = new Actor("Петр", "Петров", Gender.MALE, 190);
        Actor actor3 = new Actor("Вера", "Сидорова", Gender.FEMALE, 150);
        Director director1 = new Director("Виктор", "Виктюк", Gender.MALE, 1000);
        Director director2 = new Director("Роберт", "Пеотровский", Gender.MALE, 400);

        System.out.println(director1 + " количество поставленных спектаклей: " + director1.getNumberOfShows());
        System.out.println(director2 + " количество поставленных спектаклей: " + director2.getNumberOfShows());

        // Также создайте одного автора музыки и одного хореографа
        MusicAuthor musicAuthor = new MusicAuthor("Матвей", "Тверской", Gender.MALE);
        // Устранение замечания: Переменная начинается с кириллической буквы с, а не латинской c
        Choreographer choreographer = new Choreographer("Диана", "Цискаридзе", Gender.FEMALE);

        // Создать три спектакля: обычный, оперный и балет
        Show show = new Show("Преступление и наказание", 200, director1);
        Opera opera = new Opera("Евгений Онегин", 180, director2, musicAuthor, "Либретто1", 30);
        Ballet ballet = new Ballet("Война и мир", 300, director1, musicAuthor, "Либретто2", choreographer);

        // Распределить актёров по спектаклям.
        // Используйте для этого метод добавления нового актёра в спектакль.
        // Один актёр может участвовать в нескольких спектаклях.
        System.out.println(show.getTitle());
        show.addNewActorToShow(actor1);
        show.addNewActorToShow(actor1);
        show.addNewActorToShow(actor2);
        System.out.println(show.getDirector());

        System.out.println(opera.getTitle());
        opera.addNewActorToShow(actor2);
        opera.addNewActorToShow(actor3);
        System.out.println(opera.getDirector());

        System.out.println(ballet.getTitle());
        ballet.addNewActorToShow(actor1);
        ballet.addNewActorToShow(actor2);
        ballet.addNewActorToShow(actor3);
        System.out.println(ballet.getDirector());

        // Для каждого спектакля выведите на экран список актёров.
        show.printListOfActors();
        opera.printListOfActors();
        ballet.printListOfActors();

        // Замените актёра в одном из спектаклей на актёра из другого спектакля
        // и ещё раз выведите для него список актёров.
        System.out.println("Заменяем актера \"Петров\" на \"" + actor1.getSurname() + "\"");
        opera.replaceActorInShow(actor1,"Петров");
        opera.printListOfActors();

        opera.replaceActorInShow(actor1,"Иванов");

        // Попробуйте заменить в другом спектакле несуществующего актёра
        System.out.println("Пробуем заменить актера \"Сидоров\" на " + actor2.getSurname() + "\"");
        ballet.replaceActorInShow(actor2, "Сидоров");

        // Для оперного и балетного спектакля выведите на экран текст либретто.
        System.out.println("Выводим либретто для оперы:");
        opera.printLibrettoText();
        System.out.println("Выводим либретто для балета:");
        ballet.printLibrettoText();

        System.out.println(opera.getTitle() + ": " + opera.getMusicAuthor() + ". Хор " + opera.getChoirSize() + " человек");
        System.out.println(ballet.getTitle() + ": " + ballet.getChoreographer() + ", " + ballet.getMusicAuthor());
    }
}
