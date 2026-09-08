package Project1.BasicOperations;

public class Division extends Operation{

    public Division(int num1,int num2){

        super(num1,num2);
    }

    @Override

    public double execute(){
        if (num1() == 0)throw  new IllegalArgumentException("Numerator cannot be 0.");
        if (num2()== 0)throw new IllegalArgumentException("Cannot divide by 0.");
        return Math.ceilDiv(num1(),num2());
    }
}
