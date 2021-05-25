package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class callTest {
    Smartphone smartphone = new Smartphone("Samsung", "S8", "Android 10");
    @Test
    public void MCDC(){
        Assert.assertEquals(true,smartphone.isNumberCorrect("0612345678"));//111
        Assert.assertEquals(false,smartphone.isNumberCorrect("1612345678"));//110
        Assert.assertEquals(false,smartphone.isNumberCorrect("06123"));//101
        Assert.assertEquals(false,smartphone.isNumberCorrect("061abc2345"));//011
    }
}