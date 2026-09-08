package Project1.BasicOperations;

public class Subtraction extends Operation{

    public Subtraction(int num1, int num2){
        super(num1, num2);
    }

    @Override

    public double execute(){return num1() - num2();}

    @Override

    public String toString(){
        return "The difference between " + num1() + " and " + num2() + "is" + execute();
    }
}
