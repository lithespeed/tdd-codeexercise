package test.unit.com.stringset;

import main.com.stringset.StringSet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringSetTest {
    private StringSet testSubject;

    @BeforeEach
    public void setUp() {
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

    @Test
    public void itUnionsTwoSets() {
        // arrange
        testSubject.add("abcd");

        StringSet secondSet = new StringSet();
        secondSet.add("efgh");
        // act
        StringSet unionedSet = testSubject.union(secondSet);
        // assert
        assertEquals(2, unionedSet.size());
        assertTrue(unionedSet.contains("efgh"));
        assertTrue(unionedSet.contains("abcd"));
    }

    @Test
    public void itIntersects() {
        //arrange
        testSubject.add("abcd");
        testSubject.add("efgh");

        StringSet secondSet = new StringSet();
        secondSet.add("efgh");
        secondSet.add("ijkl");
        //act
        StringSet intersectedSet = testSubject.intersection(secondSet);
        //assert
        assertEquals(1, intersectedSet.size());
        assertTrue(intersectedSet.contains("efgh"));
    }

    @Test
    public void itEnumeratesNonEmptySet() {
        //arrange
        testSubject.add("apple");
        testSubject.add("banana");
        testSubject.add("orange");

        List<String> expected = new ArrayList<>();
        expected.add("apple");
        expected.add("banana");
        expected.add("orange");

        List<String> actual = testSubject.enumerate();
        assertEquals(3, actual.size());
        assertTrue(actual.contains("apple"));
        assertTrue(actual.contains("banana"));
        assertTrue(actual.contains("orange"));
    }

    @Test
    public void itAttemptsToRemoveAStringThatDoesNotExist() throws Exception {
        testSubject.add("abcd");
        assertThrows(Exception.class, () -> testSubject.remove("xyz"));
    }

    @Test
    public void itClears() {
        //arrange
        testSubject.add("abcd");
        //act
        testSubject.clear();
        //assert
        assertEquals(0, testSubject.size());
    }
}
