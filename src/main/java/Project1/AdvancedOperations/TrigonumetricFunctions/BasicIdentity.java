package Project1.AdvancedOperations.TrigonumetricFunctions;

import Project1.BasicOperations.Operation;

public abstract class BasicIdentity extends Operation {

    private double angle;

    public BasicIdentity(double angle){
        super(0,0);
        this.angle = angle;
    }

    public double getAngle(){
        return angle;
    }

    public abstract double execute();
}
