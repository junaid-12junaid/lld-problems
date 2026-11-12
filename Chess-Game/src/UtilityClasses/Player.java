package UtilityClasses;

public class Player {
    String name;
    Boolean isWhite;

    public Player(String name, Boolean isWhite) {
        this.name = name;
        this.isWhite = isWhite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getWhite() {
        return isWhite;
    }

    public void setWhite(Boolean white) {
        isWhite = white;
    }
}
