package test.java.com.swiggy.magicalarena.testing;
import main.java.com.swiggy.magicalarena.code.classes.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testWizardInitialization() {
        Wizard wizard = new Wizard(50, 5, 10);
        assertEquals(50, wizard.getHealth());
        assertEquals(5, wizard.getStrength());
        assertEquals(10, wizard.getAttackPower());
        assertTrue(wizard.isAlive());
    }

    @Test
    public void testReduceHealth() {
        Wizard wizard = new Wizard(50, 5, 10);
        wizard.reduceHealth(20);
        assertEquals(30, wizard.getHealth());
        assertTrue(wizard.isAlive());
    }

    @Test
    public void testReduceHealthBelowZero() {
        Wizard wizard = new Wizard(50, 5, 10);
        wizard.reduceHealth(60); // Reducing health beyond zero
        assertEquals(0, wizard.getHealth());
        assertFalse(wizard.isAlive());
    }
}
