package Characters;

public class Character {

    private int health;
    private int strength;
    private String name;

    public Character(int health, int strength, String name) {
        this.health     = health;
        this.strength   = strength;
        this.name       = name;
    }

    public int attack() {
        return this.strength;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int damage) {
        this.health -= damage;
    }

    public int getStrength() {
        return this.strength; 
    }

    public String getName() {
        return this.name;
    }

}
