package com.tuwaner;

import com.tuwaner.junit.MyJunit;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyJunitTest {
    private MyJunit myJunit;

    @Before
    public void setUp(){
        myJunit = new MyJunit();
    }

    @Test
    public void testSayHello(){
        assertEquals("Hello Junit1", myJunit.sayHello());
    }
}
