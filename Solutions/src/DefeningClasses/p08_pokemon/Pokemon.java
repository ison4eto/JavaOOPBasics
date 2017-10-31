package DefeningClasses.p08_pokemon;

public class Pokemon {
    private String name;
    private String element;
    private int health;
    private boolean isDeleted;

    Pokemon(String name, String element, int health) {
        this.name = name;
        this.element = element;
        this.health = health;
        this.isDeleted = false;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    int getHealth() {
        return health;
    }

    void setHealth(int health) {
        this.health = health;
    }
}
