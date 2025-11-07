package dwolf.annotiations;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

class AnnotationsFun {
    @Deprecated(since = "5.3", forRemoval = true)
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    @SuppressWarnings({"unused", "deprecation"})
    public void printHello() {
        System.out.println("Hello!");
    }
}

class GameCharacter {
    @NotNull
    private String login;

    @Range(from = 1, to = 100)
    private int level = 1;

    public GameCharacter(
            @NotNull String login,
            @Range(from = 1, to = 100) int level) {
        this.login = login;
        this.level = level;
    }

    @NotNull
    public String getLogin() {
        return login;
    }

    @Range(from = 1, to = 100)
    public int getLevel() {
        return level;
    }

    /*
     In the JDK I'm using, corretto 17, it must be written this way, as min max will cause IDEA to complain.
    @Range(from = 1, to = 100)
    *
    * */
}