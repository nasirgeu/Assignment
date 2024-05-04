package main.java.com.swiggy.magicalarena.code.interfaces;

public interface GameObserver {
    void update(TeamMember attacker, TeamMember defender, int damage);
}
