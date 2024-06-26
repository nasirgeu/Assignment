package main.java.com.swiggy.magicalarena.code.classes;
import main.java.com.swiggy.magicalarena.code.interfaces.*;
import java.util.Random;

public class Wizard implements TeamMember {
    private final int initialHealth;
    private final int strength;
    private final int attackPower;
    private int health;
    private final Random random;

    public Wizard(final int initialHealth, final int strength, final int attackPower) {
        this.initialHealth = initialHealth;
        this.strength = strength;
        this.attackPower = attackPower;
        this.health = initialHealth;
        this.random = new Random();
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getStrength() {
        return strength;
    }

    @Override
    public int getAttackPower() {
        return attackPower;
    }

    @Override
    public int rollDice() {
        return random.nextInt(6) + 1;
    }

    @Override
    public void reduceHealth(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0; // Ensure health doesn't go below zero
        }
    }


    @Override
    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public void useSpecialAbility(TeamMember opponent) {
        // Implement special ability logic
    }

    public int getInitialHealth() {
        return initialHealth;
    }
}

