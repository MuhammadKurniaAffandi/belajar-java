package mukura.belajarjava.data;

/*
 *  Materi Enum Class
 *
 * */
public class Customer {
    private String name;
    // menggunakan Enum Class dari Enum Level
    private Level level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
