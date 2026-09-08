package Project1.AdvancedOperations;

import Project1.BasicOperations.Operation;

public class SquareRoot extends Operation {

    public SquareRoot(int num1){
        super(num1);
    }
    @Override

    public double execute(){
        if (num1() <= 0)throw new IllegalArgumentException("Cannot have negative Roots or zero");
        if (num1() == 0){return 1.0;}
        return Math.sqrt(num1());
    }
    }
