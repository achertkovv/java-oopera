import java.util.ArrayList;

/**
 * Опера
 */
public class Opera extends MusicalShow {
    private int choirSize; // количество человек в хоре

    public Opera(String title,
                 int duration,
                 Director director,
                 MusicAuthor musicAuthor,
                 String librettoText,
                 int choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
