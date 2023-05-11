package it.unipd.mtss;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	
    @Test
    public void testI()
    {
        assertEquals("I",IntegerToRoman.convert(1));
    }
    @Test
    public void testV()
    {
        assertEquals("V",IntegerToRoman.convert(5));
    }
    @Test
    public void testX()
    {
        assertEquals("X",IntegerToRoman.convert(10));
    }
    @Test
    public void testL()
    {
        assertEquals("L",IntegerToRoman.convert(50));
    }
    @Test
    public void testC()
    {
        assertEquals("C",IntegerToRoman.convert(100));
    }
    @Test
    public void testD()
    {
        assertEquals("D",IntegerToRoman.convert(500));
    }
    @Test
    public void testM()
    {
        assertEquals("M",IntegerToRoman.convert(1000));
    }
    @Test
    public void test888()
    {
        assertEquals("DCCCLXXXVIII",IntegerToRoman.convert(888));
    }
    @Test
    public void testAsciiArt()
    {
        assertEquals("__   __ _       _____ __      __\r\n"
        		  + "\\ \\ / /| |     |_   _|\\ \\    / /\r\n"
        		  + " \\ V / | |       | |   \\ \\  / / \r\n"
        		  + "  > <  | |       | |    \\ \\/ /  \r\n"
        		  + " / . \\ | |____  _| |_    \\  /   \r\n"
        		  + "/_/ \\_\\|______||_____|    \\/    ",RomanPrinter.print(44));
    }
    
}
