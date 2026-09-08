package Project1;

import Project1.BasicOperations.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestBasicOperations {

    @Test
    //ADDITION
    void TestAdditionOperationPositiveIntegers(){
        Operation add = new Addition(1,2);
        add.execute();
        assertEquals(3,add.execute());
    }

    @Test

    void TestAdditionOperationNegativeIntegers(){
        Operation add = new Addition(-1,-1);
        double result = add.execute();
        assertEquals(-2,result);
    }

    @Test

    void TestAdditionOperationWithMixedIntegers(){
        Operation add = new Addition(1,-200);
        double result = add.execute();
        assertEquals(-199,result);
    }

    @Test

    void TestAdditionOperationWithPositiveLargeArguments(){
        Operation add = new Addition(9000,90000);
        double result = add.execute();
        assertEquals(99000,result);
    }

    @Test

    void TestAdditionOperationWithNegativeSmallArguments(){
        Operation add = new Addition(-9000000,-10000000);
        double result = add.execute();
        assertEquals(-19000000,result);
    }
    //SUBTRACTION

    @Test

    void TestSubtractionWithPositiveIntegers(){
        Operation sub = new Subtraction(10,20);
        double result = sub.execute();
        assertEquals(-10,result);
    }

    @Test

    void TestSubtractionWithNegativeIntegers(){
        Operation sub = new Subtraction(-10,-10);
        double result = sub.execute();
        assertEquals(0,result);
    }

    @Test
    void TestSubtractionWithMixedIntegers(){
        Operation sub = new Subtraction(10,-10);
        double result = sub.execute();
        assertEquals(20,result);
    }
    @Test
    void TestSubtractionWithLargePositiveIntegers(){
        Operation sub = new Subtraction(10000000,5000000);
        double result = sub.execute();
        assertEquals(5000000,result);
    }

    @Test

    void TestSubtractionWithLargePositiveIntegers2(){
        Operation sub = new Subtraction(1000000,5000000);
        double result = sub.execute();
        assertEquals(-4000000,result);
    }

    @Test

    void TestSubtractionWithLargeNegativeValues(){
        Operation sub = new Subtraction(-1000000,-1000000);
        double result = sub.execute();
        assertEquals(0,result);
    }
    @Test

    void TestSubtractionWithLargeMixedValues(){
        Operation sub = new Subtraction(-1000000,5000000);
        double result = sub.execute();
        assertEquals(-6000000,result);
    }
    ///MULTIPLICATION
    @Test

    void TestMultiplicationPositiveNumbers(){
        Operation multiply = new Multiplication(10,10);
        double result = multiply.execute();
        assertEquals(100,result);
    }

    @Test

    void TestMultiplicationNegativeNumbers(){
        Operation multiply = new Multiplication(-10,-5);
        double result = multiply.execute();
        assertEquals(50,result);
    }

    @Test

    void TestMultiplicationWithMixedNumbers(){
        Operation multiply = new Multiplication(-10,20);
        double result = multiply.execute();
        assertEquals(-200,result);
    }
    @Test

    void TestMultiplicationWithZero(){
        Operation multiply = new Multiplication(1000000000,0);
        double result = multiply.execute();
        assertEquals(0,result);
    }

    ///DIVISION

    @Test

    void TestDivisionWithZeroIllegalArgumentException(){
        Operation div = new Division(0,2);
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                div::execute);
        assertEquals("Numerator cannot be 0.",exception.getMessage());

    }

    @Test

    void TestDivisionWithZeroThrowIllegalArgumentExceptionForDenominator(){
        Operation div = new Division(100,0);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class , div::execute);
        assertEquals("Cannot divide by 0.",exception.getMessage());
    }

    @Test
    void TestDivisionWithMixedIntegers(){
        Operation div = new Division(10,-2);
        double result = div.execute();
        assertEquals(-5,result);
    }

    @Test

    void TestDivisionWithLargeMixedIntegers(){
        Operation div = new Division(-64000,-4000);
        double result = div.execute();
        assertEquals(16,result);
    }



}
