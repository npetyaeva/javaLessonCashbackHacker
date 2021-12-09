package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CashbackHackerJupiterTest {
    private final CashbackHacker service = new CashbackHacker();

    @Test
    void shouldRemainLessBoundary() {
        assertEquals(700, service.remain(300));
    }

    @Test
    void shouldRemainBoundaryMinusOne() {
        assertEquals(1, service.remain(999));
    }

    @Test
    void shouldRemainBoundary() {
        assertEquals(0, service.remain(1000));
    }

    @Test
    void shouldRemainBoundaryPlusOne() {
        assertEquals(999, service.remain(1001));
    }

    @Test
    void shouldRemainMoreBoundary() {
        assertEquals(495, service.remain(2505));
    }
}
