package pbd.akademik.model;

/**
 * Created by maciej on 13.01.18.
 */
public enum Rola {
    STUDENT("student"),
    PRACOWNIK("pracownik"),
    ADMINISTRATOR("administrator");

    private final String text;

    /**
     * @param text
     */
    private Rola(final String text) {
        this.text = text;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return text;
    }
}
