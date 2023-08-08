package test.unit.com.calculator;

import main.com.calculator.Calculator;
import main.com.calculator.MathService;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;

public class CalculatorTest {

    @Test
    public void itAddsUsingMathService() {
        // arrange
        int firstInt = 3;
        int secondInt = 2;
        MathService stub = Mockito.mock(MathService.class);
        Calculator sut = new Calculator(stub);
        Mockito.doReturn(5).when(stub).add(firstInt, secondInt);
        // act
        int actual = sut.add(firstInt, secondInt);
        // assert
        assertEquals(5, actual);
    }
}
