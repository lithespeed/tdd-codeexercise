package test.unit.com.greeter;

import junit.framework.Assert;
import main.com.greeter.Greeter;
import main.com.greeter.TimeOfDay;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

public class GreeterTest {

    @Test
    public void itGreetsWithGenericMessage() {

        // arrange
        Greeter testSubject = new Greeter();

        // act
        String message = testSubject.getMessage("Raj");

        // assert
        Assert.assertEquals("Hello, Raj.", message);
    }

    @Test
    public void itGreetsWithGoodMorningMessage() {

        // arrange
        Greeter testSubject = new Greeter();
        TimeOfDay mockTimeOfDay = mock(TimeOfDay.class);
        testSubject.setTimeOfDay(mockTimeOfDay);

        doReturn(Integer.valueOf(0600)).when(mockTimeOfDay).getMilitaryTime();

        // act
        String message = testSubject.getMessage("Raj");

        // assert
        Assert.assertEquals("Good Morning, Raj.", message);
    }

    @Test
    public void itGreetsWithGoodAfternoonMessage() {

        // arrange
        Greeter testSubject = new Greeter();
        TimeOfDay mockTimeOfDay = mock(TimeOfDay.class);
        testSubject.setTimeOfDay(mockTimeOfDay);

        doReturn(Integer.valueOf(1300)).when(mockTimeOfDay).getMilitaryTime();

        // act
        String message = testSubject.getMessage("Raj");

        // assert
        Assert.assertEquals("Good Afternoon, Raj.", message);
    }

    @Test
    public void itGreetsWithGoodEveningMessage() {

        // arrange
        Greeter testSubject = new Greeter();
        TimeOfDay mockTimeOfDay = mock(TimeOfDay.class);
        testSubject.setTimeOfDay(mockTimeOfDay);

        doReturn(Integer.valueOf(1700)).when(mockTimeOfDay).getMilitaryTime();

        // act
        String message = testSubject.getMessage("Aparna");

        // assert
        Assert.assertEquals("Good Evening, Aparna.", message);
    }

    @Test
    public void itGreetsWithGoodNightMessage() {

        // arrange
        Greeter testSubject = new Greeter();
        TimeOfDay mockTimeOfDay = mock(TimeOfDay.class);
        testSubject.setTimeOfDay(mockTimeOfDay);

        doReturn(Integer.valueOf(2200)).when(mockTimeOfDay).getMilitaryTime();

        // act
        String message = testSubject.getMessage("George");

        // assert
        Assert.assertEquals("Good Night, George.", message);
    }
}
