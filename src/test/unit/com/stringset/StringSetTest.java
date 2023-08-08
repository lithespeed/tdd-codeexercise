package test.unit.com.stringset;

import main.com.stringset.StringSet;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class StringSetTest {
    private StringSet testSubject;

    @Test
    public void itAddsAStringToAnEmptySet() {
        testSubject = new StringSet();
        testSubject.add("abcd");    // act
        assertEquals(1, testSubject.size());   // assert
    }

    @Test
    public void itAddsMultipleStringsToANonEmptySet() {
        // arrange
        testSubject = new StringSet();
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
        testSubject = new StringSet();
        testSubject.add("one");
        testSubject.add("one");
        assertEquals(1, testSubject.size());
    }

    @Test
    public void itRemovesTheOnlyElementInSet() throws Exception {
        testSubject = new StringSet();
        testSubject.add("abcd");
        testSubject.remove("abcd");
        assertEquals(0, testSubject.size());
    }

    /*@Test(expected = Exception.class)
    public void itAttemptsToRemoveAStringThatDoesNotExist() throws Exception {
        testSubject.add("abcd");
        testSubject.remove("xyz");
    }*/
}
