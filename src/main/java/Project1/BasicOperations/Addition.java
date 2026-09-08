package Project1.BasicOperations;

public class Addition extends Operation{

    public Addition(int num1, int num2){
         super(num1,num2);
    }

    @Override

    public double execute(){
        return num1() + num2();}

    @Override

    public String toString(){
        return "The Addition of " + num1() + " and " + num2() + " is: " + execute();
    }


}
