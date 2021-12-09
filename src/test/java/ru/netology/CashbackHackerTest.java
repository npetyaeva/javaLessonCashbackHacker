package ru.netology;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;

public class CashbackHackerTest {
    private final CashbackHacker service = new CashbackHacker();

    @Test
    public void shouldRemainLessBoundary() {
        assertEquals(700, service.remain(300));
    }

    @Test
    public void shouldRemainBoundaryMinusOne() {
        assertEquals(1, service.remain(999));
    }

    @Test
    public void shouldRemainBoundary() {
        assertEquals(0, service.remain(1000));
    }

    @Test
    public void shouldRemainBoundaryPlusOne() {
        assertEquals(999, service.remain(1001));
    }

    @Test
    public void shouldRemainMoreBoundary() {
        assertEquals(495, service.remain(2505));
    }
}

class CashbackHackerJupiterTest {
    private final CashbackHacker service = new CashbackHacker();

    @org.junit.jupiter.api.Test
    void shouldRemainLessBoundary() {
        Assertions.assertEquals(700, service.remain(300));
    }

    @org.junit.jupiter.api.Test
    void shouldRemainBoundaryMinusOne() {
        Assertions.assertEquals(1, service.remain(999));
    }

    @org.junit.jupiter.api.Test
    void shouldRemainBoundary() {
        Assertions.assertEquals(0, service.remain(1000));
    }

    @org.junit.jupiter.api.Test
    void shouldRemainBoundaryPlusOne() {
        Assertions.assertEquals(999, service.remain(1001));
    }

    @org.junit.jupiter.api.Test
    void shouldRemainMoreBoundary() {
        Assertions.assertEquals(500, service.remain(2500));
    }
}