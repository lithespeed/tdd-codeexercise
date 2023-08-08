package test.unit.com.wordwrap;

import main.com.wordwrap.WordWrapper;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class WordWrapperTest {

    @Test
    public void itDoesNotWrap() {
        // arrange
        WordWrapper testSubject = new WordWrapper();
        String input = "Hello Raj!";
        int rowLength = 20;
        // act
        String output = testSubject.wrap(input, rowLength);
        // assert
        Assert.assertEquals("Hello Raj!", output);
    }

    @Test
    public void itWrapsOnce() {
        // arrange
        WordWrapper testSubject = new WordWrapper();
        String input = "Hello";
        int rowLength = 3;
        // act
        String output = testSubject.wrap(input, rowLength);
        // assert
        Assert.assertEquals("Hel\nlo", output);
    }
















    /*
    @Test
    public void itDoesNotWrap() {

        // arrange
        WordWrapper testSubject = new WordWrapper();
        String inStr = "Hi there";
        int rowLength = 100;

        // act
        String retStr = testSubject.wrap(inStr, rowLength);

        // assert
        Assert.assertEquals("Hi there", retStr);
    }
    */

/*
    @Test
    public void itWrapsOnce() {

        // arrange
        WordWrapper testSubject = new WordWrapper();
        String inStr = "Hi there";
        int rowLength = 5;

        // act
        String retStr = testSubject.wrap(inStr, rowLength);

        // assert
        Assert.assertEquals("Hi th\nere", retStr);
    }
    */
































    /*
    @Test
    public void itDoesNotWrap() {

        // arrange
        WordWrapper testSubject = new WordWrapper();
        String input = "Raj";
        int rowLength = 60;

        // act
        String s = testSubject.wrapIt(input, rowLength);

        // assert
        assertEquals("Raj", s);
    }

    @Test
    public void itWrapsOnce() {

        // arrange
        WordWrapper testSubject = new WordWrapper();
        String input = "Raj";
        int rowLength = 2;

        // act
        String s = testSubject.wrapIt(input, rowLength);

        // assert
        assertEquals("Ra\nj", s);


    }
    */





























    /*
    @Test
    public void itDoesNotWrap() {

        // Arrange
        WordWrapper testSubject = new WordWrapper();
        String inStr = "Raj";
        int rowLen = 10;

        // Act
        String outStr = testSubject.wrap(inStr, rowLen);

        // Assert
        Assert.assertEquals("Raj", outStr);

    }

    @Test
    public  void itWrapsOnce() {

        // Arrange
        WordWrapper testSubject = new WordWrapper();
        String inStr = "Raj";
        int rowLen = 2;

        // Act
        String outStr = testSubject.wrap(inStr, rowLen);

        // Assert
        Assert.assertEquals("Ra\nj", outStr);
    }

    @Test
    public  void itWrapsMoreThanOnce() {

        // Arrange
        WordWrapper testSubject = new WordWrapper();
        String inStr = "Raj";
        int rowLen = 1;

        // Act
        String outStr = testSubject.wrap(inStr, rowLen);

        // Assert
        Assert.assertEquals("R\na\nj", outStr);
    }
    */





















    /*
    WordWrapper testSubject;

    @Before
    public void setup() {

        testSubject = new WordWrapper();

    }


    @Test
    public void itReturnsInputStringIfLessThanMaxLength() {

        // arrange
        String input = "Something is fishy here";
        int rowLength = 100;

        // act
        String wrappedString = testSubject.wrap(input, rowLength);

        // assert
        Assert.assertEquals(wrappedString, input);

    }

    @Test
    public void itWrapsOnce() {

        // arrange
        String input = "Raj";
        int rowLength = 2;

        // act
        String wrappedString = testSubject.wrap(input, rowLength);

        // assert
        Assert.assertEquals(wrappedString, "Ra\nj");

    }
    */






















    /*

    @Test
    public void itDoesNotWrapIfStringLessThanRowLength() {

        // arrange
        String input = "Raj";
        WordWrapper testSubject = new WordWrapper();
        int rowLength = 100;

        // act
        String returnedString = testSubject.wrapString(input, rowLength);

        // assert
        Assert.assertEquals(returnedString, input);
    }

    @Test
    public void itWrapsOnce() {

        // arrange
        String input = "Raj";
        WordWrapper testSubject = new WordWrapper();
        int rowLength = 2;

        // act
        String returnedString = testSubject.wrapString(input, rowLength);

        // assert
        Assert.assertEquals(returnedString, "Ra\nj");


    }

    @Test
    public void itWrapsMultipleTimes() {

        // arrange
        String input = "Raj";
        WordWrapper testSubject = new WordWrapper();
        int rowLength = 1;

        // act
        String returnedString = testSubject.wrapString(input, rowLength);

        // assert
        Assert.assertEquals(returnedString, "R\na\nj");


    }
    */














    /*
    @Test
    public void itReturnsTheInputStringAsIs_WhenInputIsShorterThanRowLength() {

        // arrange
        WordWrapper testSubject = new WordWrapper();
        String input = "Raj";
        int rowLength = 5;

        // act
        String out = testSubject.wrap(input, rowLength);

        // assert
        Assert.assertEquals(input, out);
    }

    @Test
    public void itWrapsOnce() {

        // arrange
        WordWrapper testSubject = new WordWrapper();
        String input = "Raj";
        int rowLength = 2;

        // act
        String out = testSubject.wrap(input, rowLength);

        // assert
        Assert.assertEquals("Ra\nj", out);
    }

    @Test
    public void itWrapsMutlipleTimes() {

        // arrange
        WordWrapper testSubject = new WordWrapper();
        String input = "Chumbawumba";
        int rowLength = 3;

        // act
        String out = testSubject.wrap(input, rowLength);

        // assert
        Assert.assertEquals("Chu\nmba\nwum\nba", out);
    }
    */
























    /*
    WordWrapper testSubject;

    @Before
    public void setup() {
         testSubject = new WordWrapper();

    }

    @Test
    public void givenAnEmptyStringItReturnsEmptyString() {

        String out = testSubject.wrap("", 0);

        Assert.assertEquals("", out);
    }

    @Test
    public void itReturnsInputWhenDoesNotExceedRowLength() {

        String out = testSubject.wrap("Test", 5);
        Assert.assertEquals("Test", out);

    }

    @Test
    public void itWrapsOnce() {

        String out = testSubject.wrap("Test", 3);
        Assert.assertEquals("Tes\nt", out);

    }

    @Test
    public void itWrapsTwice() {

        String out = testSubject.wrap("Testing", 3);
        Assert.assertEquals("Tes\ntin\ng", out);

    }
    */





























    /*
    WordWrapper testSubject;

    @Before
    public void setup() {
        testSubject = new WordWrapper();
    }


    @Test
    public void itDeosntWrapWhenRowLengthExceedsString() {

        // arrange
        String row = "TDD is awesome!";
        int rowLength = 60;

        // act
        String returnedRows = testSubject.wrap(row, rowLength);


        // assert
        Assert.assertEquals(row, returnedRows);
    }

    @Test
    public void itWrapsOnce() {

        // arrange
        String row = "TDD is awesome!";
        int rowLength = 8;

        // act
        String returnedRows = testSubject.wrap(row, rowLength);


        // assert
        Assert.assertEquals("TDD is a\nwesome!", returnedRows);
    }

    @Test
    public void itWrapsMultipleTimes() {

        // arrange
        String row = "TDD is awesome!";
        int rowLength = 2;

        // act
        String returnedRows = testSubject.wrap(row, rowLength);


        // assert
        Assert.assertEquals("TD\nD \nis\n a\nwe\nso\nme\n!", returnedRows);
    }
    */

























    /*
    @Test
    public void itWrapsEmptyString() {

        // Act
        String retStr = testSubject.wrap("", 5);

        // Assert
        Assert.assertEquals("", retStr);

    }

    @Test
    public void itWrapsToASingleRow() {


        // Act
        String retStr = testSubject.wrap("Raj", 5);

        // Assert
        Assert.assertEquals("Raj", retStr);

    }

    @Test
    public void itWrapsToTwoRows() {


        // Act
        String retStr = testSubject.wrap("Raj", 2);

        // Assert
        Assert.assertEquals("Ra\nj", retStr);

    }

*/


















    /*

    @Test
    public void itShouldNotWrapWhenInputIsLessThanRowLength() {

        // arrange
        WordWrapper testSubject = new WordWrapper();

        // act
        String returnedString = testSubject.wrap(20, "words");

        // assert
        assertEquals("words", returnedString);

    }

    @Test
    public void itShouldWrapOnce() {

        // arrange
        WordWrapper testSubject = new WordWrapper();

        // act
        String returnedString = testSubject.wrap(3, "words");

        // assert
        assertEquals("wor\nds", returnedString);

    }
    */

    //WordWrapper testSubject;

    /*
    @Before
    public void setup() {

        // arrange
         testSubject = new WordWrapper();

    }

    @Test
    public void itWillReturnASingleRowWhenRowLengthIsGreaterThanInputString() {


        // act
        String returnedStr = testSubject.wrap(10, "abcd");

        // assert
        assertEquals("abcd", returnedStr);

    }

    @Test
    public void itWillReturnTwoRows() {


        // act
        String returnedStr = testSubject.wrap(2, "abcd");

        // assert
        assertEquals("ab\ncd", returnedStr);

    }

    @Test
    public void itWillReturnThreeRows() {


        // act
        String returnedStr = testSubject.wrap(3, "I am Raj and I love TDD");

        // assert
        assertEquals("I am\n Ra\nj a\nnd \nI l\nove\n TD\nD", returnedStr);

    }
    */






















    /*
    WordWrapper testSubject;

    @Before
    public void setup() {

        testSubject = new WordWrapper();

    }

    @Test
    public void itReturnsNullWhenNullStringIsPassed() {


        // act
        String result = testSubject.wrap(null, 3);


        // assert
        assertEquals(null, result);

    }

    @Test
    public void itDoesNotWrapWhenInputStrIsLessThanMaxRowLength() {


        // act
        String result = testSubject.wrap("abc", 10);


    }

    @Test
    public void itWrapsOnce() {

        String result = testSubject.wrap("abc", 2);
        // assert
        assertEquals("ab\nc", result);
    }

    @Test
    public void itWrapsTwice() {

        String result = testSubject.wrap("abc", 1);
        // assert
        assertEquals("a\nb\nc", result);
    }

    @Test
    public void itWrapsMultipleTimes() {

        String result = testSubject.wrap("abcde", 1);
        // assert
        assertEquals("a\nb\nc\nd\ne", result);
    }
    */






    /*
    WordWrapper testSubject;

    @Before
    public void setup() {
        testSubject = new WordWrapper();  // arrange
    }

    @Test
    public void itNeedNotWrap() {

        // act
        String out = testSubject.wrapString("Raj", 100);

        // assert
        assertEquals("Raj", out);

    }

    @Test
    public void itWrapsTwice() {

        // act
        String out = testSubject.wrapString("Raj", 2);

        // assert
        assertEquals("Ra\nj", out);


    }

    @Test
    public void itWrapsMultipleTimes() {

        // act
        String out = testSubject.wrapString("I love being in this class!", 5);

        // assert
        assertEquals("I lov\ne bei\nng", out);


    }











    @Test
    public void itReturnsTheStringAsIs() {

        // act
        String wrappedStr = testSubject.wrapString("Rajesh", 10);

        // assert
        assertEquals("Rajesh", wrappedStr);
    }

    @Test
    public void itWrapsOnce() {

        // act
        String wrappedStr = testSubject.wrapString("Rajesh", 5);

        // assert
        assertEquals("Rajes\nh", wrappedStr);

    }

    @Test
    public void itReturnsWrappedString() {

        // act
        String wrappedStr = testSubject.wrapString("Rajesh", 2);

        // assert
        assertEquals("Ra\nje\nsh", wrappedStr);

    }

    @Test
    public void itReturnsWrappedStringWithSpaces() {

        // act
        String wrappedStr = testSubject.wrapString("Freddie Mac", 4);

        // assert
        assertEquals("Fred\ndie \nMac", wrappedStr);

    }
    */
















//      @Test
//      public void itDoesNotWrapIfInputLessThanRowLength() {
//
//        // arrange
//        WordWrapper testSubject = new WordWrapper();
//
//         // act
//         String wrappedString = testSubject.wrap("Blah", 60);
//
//         // assert
//          assertEquals("Blah", wrappedString );
//      }
//
//      @Test
//      public void itWrapsOnce() {
//
//          // arrange
//          WordWrapper testSubject = new WordWrapper();
//
//          // act
//          String wrappedString = testSubject.wrap("BlahBlah", 6);
//
//          // assert
//          assertEquals("BlahBl\nah", wrappedString );
//      }
//
//    @Test
//    public void itWrapsTwice() {
//
//        // arrange
//        WordWrapper testSubject = new WordWrapper();
//
//        // act
//        String wrappedString = testSubject.wrap("BlahBlahBlah", 4);
//
//        // assert
//        assertEquals("Blah\nBlah\nBlah", wrappedString );
//    }











//    @Test
//    public void itDoesNotWrap() {
//
//        WordWrapper testSubject = new WordWrapper();
//
//        String output = testSubject.wrap("Raj", 5);
//
//        assertEquals("Raj", output);
//
//    }
//
//    @Test
//    public void itWrapsItIntoTwoLines() {
//
//        WordWrapper testSubject = new WordWrapper();
//
//        String output = testSubject.wrap("Rajesh", 3);
//
//        assertEquals("Raj\nesh", output);
//
//    }








//    @Test
//    public void  itReturnsOneLineWhenInputStringIsLessThanRowLength() {
//
//        // arrange
//        int rowLength = 100;
//        String input = "My name is Raj";
//
//
//        // act
//        String output = WordWrapper.wrap(input, rowLength);
//
//        // assert
//        assertEquals(input, output);
//
//
//    }
//
//    @Test
//    public void itReturnsTwoLinesWhenInputStringIsGreaterThanRowLength() {
//
//        int rowLength = 10;
//        String in = "my name is raj";
//        String expected = "my name is\n raj";
//
//        String out = WordWrapper.wrap(in, rowLength);
//        Assert.assertEquals(out, expected);
//    }
//
//
//
//    @Test
//    public void itReturnsThreeLinesWhenInputStringIsGreaterThanRowLength() {
//
//        int rowLength = 10;
//        String in = "my name is raj and I am here";
//        String expected = "my name is\n raj and I\n am here";
//
//        String out = WordWrapper.wrap(in, rowLength);
//        Assert.assertEquals(out, expected);
//    }


}
