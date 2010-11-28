package junit.uebungsClasses;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

//NEW static import for assert methods
import static org.junit.Assert.*;
import uebungsClasses.*;

public class Junit4MdpJunitDemo {

//	/** our instance under test */
//    private String instance;
	private MdpJunitDemo mdpJunitDemo;
    
    // NEW methods w/ the annotation Before are executed
    // are called before each @Test method (like
    // setUp() in older junit versions
    @Before
    public void init() {
//        this.instance = "junit4";
    	mdpJunitDemo = new MdpJunitDemo();
    }

    // NEW methods w/ the annotation After are executed
    // are called before each @Test method (like
    // tearDown() in older junit versions
    @After
    public void clear() {
//        this.instance = null;
    	mdpJunitDemo = null;
    }

    // NEW methods w/ the annotation BeforeClass are executed
    // after executing all tests
    // Note: this method must be static
    @BeforeClass
    public static void beforeEverything() {
    }

    // NEW methods w/ the annotation AfterClass are executed
    // after executing all tests
    // Note: this method must be static
    @AfterClass
    public static void cleanUp() {
    }

    // NEW test methods are found w/ the new annotation Test
    // instead of the signature void testMethod
    @Test
    public void funcTest_isEmpty() {
        assertEquals(true, mdpJunitDemo.isEmpty(null));
        assertEquals(true, mdpJunitDemo.isEmpty(""));
    	assertEquals(false, mdpJunitDemo.isEmpty("Test"));
    }
    
    @Test
    public void funcTest_capitalize() {
    	assertEquals(null, mdpJunitDemo.capitalize(null));
    	assertEquals("", mdpJunitDemo.capitalize(""));
    	assertEquals("Hello", mdpJunitDemo.capitalize("hello"));
    	assertEquals("Hello", mdpJunitDemo.capitalize("HELLO"));
    	assertEquals("123abc", mdpJunitDemo.capitalize("123ABC"));
    }

    @Test(expected=NullPointerException.class) 
    public void funcTestThrowNullPointerException_reverse() {
    	mdpJunitDemo.reverse(null);
    }
  
    @Test
    public void funcTest_reverse() {
        assertEquals("zsH tseT", mdpJunitDemo.reverse("Test Hsz"));
    }
  
    @Test
    public void funcTest_join() {
        assertEquals("1 2 3", mdpJunitDemo.join("1","2","3"));
    }	
}
