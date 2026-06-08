/**
 * Балет
 */
public class Ballet extends MusicalShow {
    private final Choreographer choreographer; // хореограф

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

    public Choreographer getChoreographer() {
        return choreographer;
    }
}
