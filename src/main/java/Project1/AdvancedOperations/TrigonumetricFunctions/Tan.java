package Project1.AdvancedOperations.TrigonumetricFunctions;

public class Tan extends BasicIdentity{

    public Tan(double angle){
        super(angle);
    }

    @Override

    public double execute(){

        if (getAngle() == 90) throw new IllegalArgumentException("Undefined");

        double radians = Math.toRadians(getAngle());
        return Math.tan(radians);
    }

    @Override

    public String toString(){
        return "Tan of " + getAngle() + " = " + execute();
    }
}
