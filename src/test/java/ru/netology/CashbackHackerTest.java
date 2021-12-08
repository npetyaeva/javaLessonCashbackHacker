package ru.netology;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class CashbackHackerTest {
    private final CashbackHacker service = new CashbackHacker();

    @Test
    public void shouldRemainLessBoundary() {
        assertEquals(service.remain(300), 700);
    }

    @Test
    public void shouldRemainBoundaryMinusOne() {
        assertEquals(service.remain(999), 1);
    }

    @Test
    public void shouldRemainBoundary() {
        assertEquals(service.remain(1000), 0);
    }

    @Test
    public void shouldRemainBoundaryPlusOne() {
        assertEquals(service.remain(1001), 0);
    }

    @Test
    public void shouldRemainMoreBoundary() {
        assertEquals(service.remain(2000), 0);
    }
}