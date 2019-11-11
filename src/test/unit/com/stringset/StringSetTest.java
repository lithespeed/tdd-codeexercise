package test.unit.com.stringset;

import main.com.stringset.StringSet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringSetTest {

    StringSet testSubject;


    @Before
    public void setup() {

        testSubject = new StringSet();
    }

    @Test
    public void itAddsAStringToAnEmptySet() {

        testSubject.add("abcd");    // act

        assertEquals(1, testSubject.size());   // assert
    }

    @Test
    public void itAddsMultipleStringsToANonEmptySet()   {

       // arrange
        testSubject.add("one");
        assertEquals(1, testSubject.size());


        // act
        testSubject.add("two");
        testSubject.add("three");


        // assert
        assertEquals(3, testSubject.size());

    }

    @Test
    public void itDoesNotAddTheSameStringToSet() {

        testSubject.add("one");
        testSubject.add("one");
        assertEquals(1, testSubject.size());
    }

    @Test
    public void itRemovesTheOnlyElementInSet() throws Exception {

        testSubject.add("abcd");

        testSubject.remove("abcd");

        assertEquals(0, testSubject.size());
    }

    @Test (expected = Exception.class)
    public void itAttemptsToRemoveAStringThatDoesNotExist() throws Exception {

        testSubject.add("abcd");

        testSubject.remove("xyz");

    }



    /*
    StringSet testSubject;


    @Before
    public void setup() {
        testSubject = new StringSet(); // arrange
    }


    @Test
    public void itAddsGivenStringToEmptySet() {

        testSubject.add("one");              // act

        Assert.assertEquals(1, testSubject.size());
        Assert.assertTrue(testSubject.contains("one"));
    }


    @Test
    public void itAddsMultipleStringsToSet() {

        testSubject.add("one");
        testSubject.add("two");
        Assert.assertEquals(testSubject.size(), 2);
        Assert.assertTrue(testSubject.contains("one"));
        Assert.assertTrue(testSubject.contains("two"));
    }

    @Test
    public void itDoesNotAddTheSameStringToSet() {

        testSubject.add("one");
        testSubject.add("one");
        Assert.assertEquals(testSubject.size(), 1);
    }

    @Test
    public void itRemovesAStringFromSetOfStrings() {

        testSubject.add("one");
        testSubject.add("two");

        testSubject.print();

        testSubject.remove("one");

        Assert.assertEquals(testSubject.size(), 1);
        Assert.assertFalse(testSubject.contains("one"));
        Assert.assertTrue(testSubject.contains("two"));
    }
    */
}
