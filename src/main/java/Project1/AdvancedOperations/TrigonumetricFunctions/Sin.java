package Project1.AdvancedOperations.TrigonumetricFunctions;

public class Sin extends BasicIdentity{

    public Sin(double degrees){
        super(degrees);
    }

    public double execute(){

        double radians = Math.toRadians(getAngle());
        return Math.sin(radians);
    }

    @Override

    public String toString(){
        return "Sin of " + getAngle() + " = " + execute();
    }
}
