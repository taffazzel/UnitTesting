package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tafaz on 11/24/2016.
 */
public class Test2Test {
    @Test
    public void add() throws Exception {
        Test2 t2 = new Test2(8,6);
        assertEquals(14,t2.add());

    }

}