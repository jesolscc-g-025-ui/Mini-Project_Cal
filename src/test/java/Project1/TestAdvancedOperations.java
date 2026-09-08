package Project1;

import Project1.AdvancedOperations.ExponentialFunction;
import Project1.AdvancedOperations.SquareRoot;
import Project1.AdvancedOperations.TrigonumetricFunctions.BasicIdentity;
import Project1.AdvancedOperations.TrigonumetricFunctions.Cos;
import Project1.AdvancedOperations.TrigonumetricFunctions.Sin;
import Project1.AdvancedOperations.TrigonumetricFunctions.Tan;
import Project1.BasicOperations.Operation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestAdvancedOperations {

    @Test

    void TestAdvancedOperationsSquareRoot(){
        Operation squareRoot = new SquareRoot(10);
        double result = squareRoot.execute();
        Operation Sqroot1 = new SquareRoot(0);
        Operation squareR = new SquareRoot(1);
        double result2 = squareR.execute();
        assertEquals(10,squareRoot.num1());
        assertEquals(0,Sqroot1.num1());
        assertEquals(1,squareR.num1());
        assertEquals(Math.sqrt(squareRoot.num1()),result);
        assertThrows(IllegalArgumentException.class , Sqroot1::execute);
        assertEquals(1,result2);
    }

    @Test

    void TestAdvancedOperationsExponentialFunction(){
        Operation Xp = new ExponentialFunction(2,3);
        Operation Xp2 = new ExponentialFunction(-1,0);
        Operation Xp3 = new ExponentialFunction(1000,1);
        Operation Xp4 = new ExponentialFunction(10,-10);
        double result1 = Xp.execute();
        double result2 = Xp2.execute();
        double result3 = Xp3.execute();
        double result4 = Xp4.execute();
        assertAll("successful Operations",
                ()-> assertEquals(2,Xp.num1()),
                () -> assertEquals(-1,Xp2.num1()),
                () -> assertEquals(1000,Xp3.num1()),
                () -> assertEquals(10,Xp4.num1()),
                () -> assertEquals(3,Xp.num2()),
                () -> assertEquals(0,Xp2.num2()),
                () -> assertEquals(1,Xp3.num2()),
                () -> assertEquals(-10,Xp4.num2()),
                () -> assertEquals(Math.pow(Xp.num1(),Xp.num2()),result1),
                () -> assertEquals(1,result2),
                () -> assertEquals(1000,result3),
                () -> assertEquals(Math.pow(Xp4.num1(), Xp4.num2()),result4));
    }

    @Test

    void TestTrigonumetricFunctionsCosFunction(){
        BasicIdentity cos = new Cos(0);
        BasicIdentity cos1 = new Cos(45);
        BasicIdentity cos2 = new Cos(30);
        BasicIdentity cos3 = new Cos(60);
        BasicIdentity cos4 = new Cos(90);

        assertAll("Successful Cos Function",
                () -> assertEquals(1,cos.execute()),
                () -> assertEquals(Math.cos(Math.toRadians(45)),cos1.execute()),
                () -> assertEquals(Math.cos(Math.toRadians(30)),cos2.execute()),
                () -> assertEquals(Math.cos(Math.toRadians(60)),cos3.execute()),
                () -> assertEquals(Math.cos(Math.toRadians(90)),cos4.execute()));
    }

    @Test

    void TrigonumetricFunctionsSinFunction(){

        BasicIdentity sin1 = new Sin(0);
        BasicIdentity sin2 = new Sin(30);
        BasicIdentity sin3 = new Sin(45);
        BasicIdentity sin4 = new Sin(60);
        BasicIdentity sin5 = new Sin(90);

        assertAll("Successful sin Function",
                () -> assertEquals(Math.sin(Math.toRadians(0)),sin1.execute()),
                () -> assertEquals(Math.sin(Math.toRadians(30)),sin2.execute()),
                () -> assertEquals(Math.sin(Math.toRadians(45)),sin3.execute()),
                () -> assertEquals(Math.sin(Math.toRadians(60)),sin4.execute()),
                () -> assertEquals(Math.sin(Math.toRadians(90)),sin5.execute()));
    }

    @Test

    void TrigonumetricFunctionTanFunction(){

        BasicIdentity tan = new Tan(0);
        BasicIdentity tan1 = new Tan(30);
        BasicIdentity tan2 = new Tan(45);
        BasicIdentity tan3 = new Tan(60);
        BasicIdentity tan4 = new Tan(90);

        assertAll("Successful tan Function",
                () -> assertEquals(Math.tan(Math.toRadians(0)),tan.execute()),
                () -> assertEquals(Math.tan(Math.toRadians(30)),tan1.execute()),
                () -> assertEquals(Math.tan(Math.toRadians(45)),tan2.execute()),
                () -> assertEquals(Math.tan(Math.toRadians(60)),tan3.execute())
                );
    }
}
