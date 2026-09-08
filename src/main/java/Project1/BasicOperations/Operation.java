package Project1.BasicOperations;

public abstract class Operation {

    private int num1;
    private int num2;

    public Operation(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public Operation(int num1){
        this.num1 = num1;
    }
    public int num1(){return num1;}
    public int num2(){return num2;}

    public abstract double execute();


    @Override

    public String toString(){
        return "Operation of: "  +  num1() + " and " + num2();
    }
}
