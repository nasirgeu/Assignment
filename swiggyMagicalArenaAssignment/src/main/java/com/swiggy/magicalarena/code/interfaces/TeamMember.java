package main.java.com.swiggy.magicalarena.code.interfaces;

public interface TeamMember {
    int getHealth();
    int getStrength();
    int getAttackPower();
    int rollDice();
    void reduceHealth(int damage);
    boolean isAlive();
    void useSpecialAbility(TeamMember opponent);
}
