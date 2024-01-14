package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;
public class CashbackHackServiceTest {
    @Test
    public void shouldMakeDecreaseAmount() {
        CashbackHackService cash = new CashbackHackService();

        int actual = cash.remain(999);
        int expected = 1;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void shouldMakeIncreaseAmount() {
        CashbackHackService cash = new CashbackHackService();

        int actual = cash.remain(1001);
        int expected = 999;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldMakeAmountEqualSumOfCashback() {
        CashbackHackService cash = new CashbackHackService();

        int actual = cash.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldMakeZeroAmount() {
        CashbackHackService cash = new CashbackHackService();

        int actual = cash.remain(0);
        int expected = 1000;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldMakeAmount() {
        CashbackHackService cash = new CashbackHackService();

        int actual = cash.remain(900);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }


}