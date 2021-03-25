package za.ac.cput;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Enemy {
    private int health;
    private String name;

    public Enemy() {
        this.health = 100;
        this.name = "Baddy";
    }

    public Enemy(int health, String name) {
        this.health = health;
        this.name = name;
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

    public int Attack() {
        int damage = new Random().nextInt(20);
        this.health -= damage;
        if(this.health > 0)
            System.out.println(
                    "You attacked " + this.name + " for " + damage + " points of damage!" +
                    "They now have " + this.health + " health remaining."
            );
        else
            System.out.println(
                    "You attacked " + this.name + " for " + damage + " points of damage!" +
                    this.name + " has been defeated!"
            );
        return this.health;
    }

    public void Block() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "health=" + health +
                ", name='" + name + '\'' +
                '}';
    }
}
