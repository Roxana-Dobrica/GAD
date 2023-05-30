/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boxing;

/**
 *
 * @author Roxana
 */
public class Fighter {
    private String name;
    private int health;
    private int damagePerAttack;

    public Fighter(String name, int health, int damage) {
        this.name = name;
        setHealth(health);
        damagePerAttack = damage;
    }

    private void setHealth(int health) {
        if (health > 0)
            this.health = health;
        else
            this.health = 100;
    }

    public void attack( Fighter f1) {
        f1.health = f1.health - damagePerAttack;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return name;
    }
}