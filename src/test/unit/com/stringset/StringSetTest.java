package test.unit.com.stringset;

import main.com.stringset.StringSet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringSetTest {
    private StringSet testSubject;

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
    public void itAddsMultipleStringsToANonEmptySet() {
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

    @Test(expected = Exception.class)
    public void itAttemptsToRemoveAStringThatDoesNotExist() throws Exception {
        testSubject.add("abcd");
        testSubject.remove("xyz");
    }
}
