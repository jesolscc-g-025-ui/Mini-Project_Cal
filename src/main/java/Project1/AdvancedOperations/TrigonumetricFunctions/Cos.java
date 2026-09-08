package Project1.AdvancedOperations.TrigonumetricFunctions;

import javax.swing.border.MatteBorder;

public class Cos extends BasicIdentity{

    public Cos(double degrees){
        super(degrees);
    }

    @Override

    public double execute(){


        double radians = Math.toRadians(getAngle());
        return Math.cos(radians);
    }
    @Override

    public String toString(){
        return "Cos of " + getAngle() + " = " + execute();
    }
}
