package ru.netology;

public class CashbackHacker {
    private final int boundary = 1000;

    public int remain(int amount) {
        return amount % boundary == 0 ? 0 : boundary - amount % boundary;
    }
}
