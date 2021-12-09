package ru.netology;

import org.junit.Test;

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