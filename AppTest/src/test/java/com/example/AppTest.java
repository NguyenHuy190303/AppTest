package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    App app = new App();

    @Test
    public void testSum() {
        assertEquals(10, app.sum(6, 4));
        assertEquals(0, app.sum(0, 0));
        assertEquals(0, app.sum(-6, 6));
    }

    @Test
    public void testDivide() {
        assertEquals("1.33", app.divide(4, 3));
        assertEquals("0", app.divide(0, 1));
        assertEquals("NaN", app.divide(1, 0));
    }

    @Test
    public void testReturnTwoChars() {
        assertEquals("qw", app.returnTwoChars("qwerty"));
        assertEquals("VA", app.returnTwoChars("VA"));
        assertEquals("V", app.returnTwoChars("V"));
        assertEquals("", app.returnTwoChars(""));
        assertNull(app.returnTwoChars(null));
    }

    @Test
    public void testDiv() {
        assertEquals(Double.valueOf("1.33"), app.div(Double.valueOf(4), Double.valueOf(3)));
        assertEquals(Double.valueOf("33"), app.div(Double.valueOf(99), Double.valueOf(3)));
        assertNull(app.div(null, Double.valueOf(3)));
        assertNull(app.div(Double.valueOf(3), null));
        assertNull(app.div(Double.valueOf(3), Double.valueOf(0)));
    }
}
