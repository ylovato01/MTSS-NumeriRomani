////////////////////////////////////////////////////////////////////
// Matteo Vignaga 1201147
// Yuri Lovato 1238100
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TestRomanNumber 
{
    /**
     * Rigorous Test :-)
     */
	
    @Test
    public void test999()
    {
        assertEquals("CMXCIX",IntegerToRoman.convert(999));
    }
    @Test
    public void test888()
    {
        assertEquals("DCCCLXXXVIII",IntegerToRoman.convert(888));
    }
    @Test
    public void test777()
    {
        assertEquals("DCCLXXVII",IntegerToRoman.convert(777));
    }
    @Test
    public void test666()
    {
        assertEquals("DCLXVI",IntegerToRoman.convert(666));
    }
    @Test
    public void test555()
    {
        assertEquals("DLV",IntegerToRoman.convert(555));
    }
    @Test
    public void test444()
    {
        assertEquals("CDXLIV",IntegerToRoman.convert(444));
    }
    @Test
    public void test333()
    {
        assertEquals("CCCXXXIII",IntegerToRoman.convert(333));
    }
    @Test
    public void test222()
    {
        assertEquals("CCXXII",IntegerToRoman.convert(222));
    }
    @Test
    public void test111()
    {
        assertEquals("CXI",IntegerToRoman.convert(111));
    }
    @Test
    public void testAsciiArt44()
    {
        assertEquals("__   __ _       _____ __      __\n"
        		  + "\\ \\ / /| |     |_   _|\\ \\    / /\n"
        		  + " \\ V / | |       | |   \\ \\  / / \n"
        		  + "  > <  | |       | |    \\ \\/ /  \n"
        		  + " / . \\ | |____  _| |_    \\  /   \n"
        		  + "/_/ \\_\\|______||_____|    \\/    \n",RomanPrinter.print(44));
    }
    @Test
    public void testAsciiArt1000()
    {
        assertEquals(" __  __ \n"
        			+ "|  \\/  |\n"
        			+ "| \\  / |\n"
        			+ "| |\\/| |\n"
        			+ "| |  | |\n"
        			+ "|_|  |_|\n"
        			+ "",RomanPrinter.print(1000));
    }
    @Test
    public void testAsciiArt500()
    {
        assertEquals(" _____  \n"
        			+ "|  __ \\ \n"
        			+ "| |  | |\n"
        			+ "| |  | |\n"
        			+ "| |__| |\n"
        			+ "|_____/ \n",RomanPrinter.print(500));
    }
    @Test
    public void testAsciiArt100()
    {
        assertEquals("  _____ \n"
        			+ " / ____|\n"
        			+ "| |     \n"
        			+ "| |     \n"
        			+ "| |____ \n"
        			+ " \\_____|\n",RomanPrinter.print(100));
    }
    
    
}
