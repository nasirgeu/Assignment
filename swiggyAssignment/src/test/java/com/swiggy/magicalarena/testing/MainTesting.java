package test.java.com.swiggy.magicalarena.testing;


import main.java.com.swiggy.magicalarena.code.interfaces.*;
import main.java.com.swiggy.magicalarena.code.classes.*;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class MainTesting {
    @Test
    public void testInitiateBattle() {
        TeamMember playerA = new Wizard(50, 5, 10);
        TeamMember playerB = new Wizard(100, 10, 5);
        final GameObserver audience;
        if (playerA.getHealth() < playerB.getHealth())
            audience = new Audience("PlayerA", "PlayerB");
        else
            audience = new Audience("PlayerB", "PlayerA");
        final BattleMain battleMain = new BattleMain(playerA, playerB, audience);
        final BattleContext context = new BattleContext();
        context.handle(battleMain);

        assertFalse(playerA.isAlive() && playerB.isAlive());
    }
}