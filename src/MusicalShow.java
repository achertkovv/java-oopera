import java.util.ArrayList;

/**
 * Музыкальный спектакль
 */
public class MusicalShow extends Show {
    private MusicAuthor musicAuthor; // автор музыки
    private final String librettoText; // текст либретто

    public MusicalShow(String title,
                       int duration,
                       Director director,
                       MusicAuthor musicAuthor,
                       String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.println(librettoText);
    }
}
