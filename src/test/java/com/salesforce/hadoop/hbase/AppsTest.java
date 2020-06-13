package com.salesforce.hadoop.hbase;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

public class AppsTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Ignore
    @Test
    public void testAppsConstructor() {
        try {
            new Apps();
            //assertEquals(false,true);
        } catch (Exception e) {
            fail("Construction failed.");
        }
    }

    @Ignore
    @Test
    public void testAppsMain()
    {
        Apps.Main(null);
        try {
            java.util.Random rand = new java.util.Random();
            //rand.setSeed(45);
            int r = rand.nextInt(100);
            String str;
            if(r<0){
                str = "Hello Univers!";
            }
            else{
                str = "Hello Universe!";
            }
            assertEquals(str + System.getProperty("line.separator"), outContent.toString());
        } catch (AssertionError e) {
            fail("\"message\" is not \"Hello Universe!\"");
        }
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

}
