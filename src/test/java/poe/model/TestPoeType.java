package poe.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TestPoeType {

    /**
     * test to demonstrate that equals and == are
     * equivalent for enum types (only if first arg is non null)
     */
    @Test
    void testEqualsPOEI() {
        PoeType poeType = PoeType.POEI;
        assertEquals(PoeType.POEI, poeType);
        assertSame(PoeType.POEI, poeType);
        // same thing by calling explictly equals and ==
        // NB: SonarLint detects that
        assertTrue(PoeType.POEI.equals(poeType));
        assertTrue(PoeType.POEI == poeType);
    }

    /**
     * test to demonstrate that enum toString is by default the literal value
     */
    @Test
    void testToStringPOEI() {
        PoeType poeType = PoeType.POEI;
        assertEquals("POEI", poeType.toString());
    }

    /**
     * What can be done with enums
     * @param poeType
     */
    @ParameterizedTest
    @EnumSource(PoeType.class)
    void testAllLiterals(PoeType poeType){
        assertDoesNotThrow(() -> {
            // call toString indirectly
            System.out.println(poeType);
            // call toString directly
            System.out.println(poeType.toString());
            // name is final not toString
            System.out.println(poeType.name());
            // ordinal is the index of the literal in the enum definition
            System.out.println(poeType.ordinal());
        });
    }

}