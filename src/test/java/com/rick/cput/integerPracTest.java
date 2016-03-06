package com.rick.cput;

//import junit.framework.TestCase;
import org.hamcrest.core.Is;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Rick on 06-Mar-16.
 */
public class integerPracTest{

    @Test
    public void testAddInt() throws Exception {

        int a = 3;
        int b = 2;


         int actual =   integerPrac.addInt(a,b);

        //int expected = 5;
        assertThat(actual, Is.is(5));

    }
}