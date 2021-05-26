package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class checkAgeTest {

    @Test
    void checkAge() {
        Assert.assertEquals(0,Telephone.checkAge(6));
        Assert.assertEquals(60,Telephone.checkAge(7));
        Assert.assertEquals(60,Telephone.checkAge(8));
        Assert.assertEquals(60,Telephone.checkAge(11));
        Assert.assertEquals(240,Telephone.checkAge(12));
        Assert.assertEquals(240,Telephone.checkAge(13));
    }
}