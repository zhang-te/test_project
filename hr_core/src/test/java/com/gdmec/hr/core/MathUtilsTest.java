package com.gdmec.hr.core;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Classname MathUtilsTest
 * @Description TODO
 * @Date 2018-12-31 下午 03:52
 * @Created by zhangjian
 */
public class MathUtilsTest {
    MathUtils math;
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        math=new MathUtils();
    }

    @Test
    public void add() {
        Assert.assertEquals(2,math.add(1,1));
    }

    @Test
    public void ss() {
        Assert.assertEquals(3,math.ss(1,2));
    }
}