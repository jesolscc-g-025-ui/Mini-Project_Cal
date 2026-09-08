package Project1.BasicOperations;

public class Multiplication extends Operation{

    public Multiplication(int num1, int num2){
        super(num1, num2);
    }

    @Override

    public double execute(){
        return num1() * num2();}

    @Override

    public String toString(){
        return "The Product of: " + num1() + " and " + num2() + ": " + execute();
    }
}
