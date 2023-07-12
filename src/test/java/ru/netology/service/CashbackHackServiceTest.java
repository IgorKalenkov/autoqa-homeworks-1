package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void purchaseIsEqualToBonus() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(1000), 0);
    }

    @Test
    public void purchaseZero() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void purchaseLessBonus() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(650), 350);
    }

    @Test
    public void purchaseLessDoubleBonus() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(1050), 950);
    }
}