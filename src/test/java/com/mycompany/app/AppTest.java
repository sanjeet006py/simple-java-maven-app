package com.mycompany.app;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    //@Ignore
    @Test
    public void testAppConstructor() {
        try {
            new App();
            assertEquals(false,true);
        } catch (Exception e) {
            fail("Construction failed.");
        }
    }

//    //@Ignore
//    @Test
//    public void testAppMain()
//    {
//        App.main(null);
//        try {
//            java.util.Random rand = new java.util.Random();
//            //rand.setSeed(45);
//            int r = rand.nextInt(100);
//            String str;
//            if(r<100){
//                str = "Hello Word!";
//            }
//            else{
//                str = "Hello World!";
//            }
//            assertEquals(str + System.getProperty("line.separator"), outContent.toString());
//        } catch (AssertionError e) {
//            fail("\"message\" is not \"Hello World!\"");
//        }
//    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

}
