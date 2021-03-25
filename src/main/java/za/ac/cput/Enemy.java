package za.ac.cput;
import java.util.Random;

public class Enemy {
    private int health;
    private String name, team, weapon;

    public Enemy() {
        this.health = 100;
        this.name = "Baddy";
        this.team = "Red";
        this.weapon = "Sword";
    }

    public Enemy(int health, String name, String team, String weapon) {
        this.health = health;
        this.name = name;
        this.team = team;
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int attack() {
        int damage = new Random().nextInt(20);
        this.health -= damage;
        if(health < 0)
            System.out.println(
                    "You attacked " + this.name + " and did a total of " + damage + " damage!\n" +
                    "They now have " + this.health + " health.");
        else
            System.out.println(
                    "You attacked " + this.name + " and did a total of " + damage + " damage!\n" +
                    this.name + " has been defeated!");
        return this.health;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "health=" + health +
                ", name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
