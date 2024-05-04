package main.java.com.swiggy.magicalarena.code.classes;
import main.java.com.swiggy.magicalarena.code.interfaces.*;
import java.util.Random;

public class BattleMain {
    private final TeamMember teamMemberA;
    private final TeamMember teamMemberB;
    private final GameObserver observer;

    public BattleMain(final TeamMember teamMemberA, final TeamMember teamMemberB, final GameObserver observer) {
        this.teamMemberA = teamMemberA;
        this.teamMemberB = teamMemberB;
        this.observer = observer;
        Random random = new Random();
    }

    public void startBattle() {
        TeamMember attacker = teamMemberA.getHealth() < teamMemberB.getHealth() ? teamMemberA : teamMemberB;
        TeamMember defender = attacker == teamMemberA ? teamMemberB : teamMemberA;

        while (teamMemberA.isAlive() && teamMemberB.isAlive()) {
            int attackRoll = attacker.rollDice();
            int defenseRoll = defender.rollDice();

            int damage = (attackRoll * attacker.getAttackPower()) - (defenseRoll * defender.getStrength());

            if (damage > 0) {
                defender.reduceHealth(damage);
            }

            observer.update(attacker, defender, damage);

            // Swap attacker and defender
            TeamMember temp = attacker;
            attacker = defender;
            defender = temp;
        }

//        if (teamMemberA.isAlive()) {
//            System.out.println("Team A emerges victorious!");
//        } else {
//            System.out.println("Team B emerges victorious!");
//        }
    }
}

