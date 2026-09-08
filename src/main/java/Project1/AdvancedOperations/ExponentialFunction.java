package Project1.AdvancedOperations;

import Project1.BasicOperations.Operation;

public class ExponentialFunction extends Operation {

    public ExponentialFunction(int num1,int num2){
        super(num1, num2);
    }
    @Override

    public double execute(){
        if (num2() == 0){return 1.0;}
        if (num2() == 1){return num1();}
        return Math.pow(num1(),num2());
    }
}
