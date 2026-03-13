package edu.teamrocket.golfstrokes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class HoleTest {

    private Hole hole;
    private final Byte initialNumber = 1;
    private final Byte initialPar = 4;

    @BeforeEach
    void setUp() {
        // Configuramos un objeto Hole antes de cada test
        hole = new Hole(initialNumber, initialPar);
    }

    @Test
    @DisplayName("El constructor debería asignar los valores correctamente")
    void constructorShouldAssignValues() {
        assertNotNull(hole, "El objeto Hole no debería ser nulo");
    }

    @Test
    @DisplayName("getNumber debería devolver el número de hoyo correcto")
    void getNumberShouldReturnCorrectValue() {
        assertEquals(initialNumber, hole.getNumber(), "El número del hoyo debe coincidir con el valor inicial");
    }

    @Test
    @DisplayName("getPar debería devolver el valor de par correcto")
    void getParShouldReturnCorrectValue() {
        assertEquals(initialPar, hole.getPar(), "El par del hoyo debe coincidir con el valor inicial");
    }
}