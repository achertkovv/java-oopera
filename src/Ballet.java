import java.util.ArrayList;

/**
 * Балет
 */
public class Ballet extends MusicalShow {
    private Choreographer choreographer; // хореограф

    public Ballet(String title,
                  int duration,
                  Director director,
                  MusicAuthor musicAuthor,
                  String librettoText,
                  Choreographer choreographer) {
        super(title,
                duration,
                director,
                musicAuthor,
                librettoText);
        this.choreographer = choreographer;
    }
}
