package Project1.Client;

import Project1.AdvancedOperations.TrigonumetricFunctions.Cos;
import Project1.AdvancedOperations.TrigonumetricFunctions.Sin;
import Project1.AdvancedOperations.TrigonumetricFunctions.Tan;
import Project1.BasicOperations.*;
import Project1.Memory.Memory;

import java.util.Scanner;

import static java.lang.Integer.getInteger;
import static java.lang.System.out;

public class UserInterface {


    public static void main(String[] args) {

//        try(Scanner scanner = new Scanner(System.in)){
//            System.out.println("Is this a server");
//            if (scanner.nextLine().equalsIgnoreCase("yes")){
//                new Server().start();
//            }
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }



        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        String[] args1 = string.trim().toLowerCase().split("\\s");

        if (args1.length > 1) {
            switch (args1[0].trim().toLowerCase()) {
                case "addition":
                    int n1 = Integer.parseInt(args1[1]);
                    int n2 = Integer.parseInt(args1[2]);
                    Addition addition = new Addition(n1, n2);
                    double result = addition.execute();
                    Memory op1 = new Memory();
                    op1.getHistory().add(addition);

                    out.println(result);
                    break;

                case "subtraction":
                    int nu1 = Integer.parseInt(args1[1]);
                    int nu2 = Integer.parseInt(args1[2]);
                    Subtraction sub = new Subtraction(nu1, nu2);
                    String result1 = Double.toString(sub.execute());
                    Memory op2 = new Memory();
                    op2.getHistory().add(sub);
                    out.println(result1);
                    break;

                case "multiplication":
                    int num1 = Integer.parseInt(args1[1]);
                    int num2 = Integer.parseInt(args1[2]);
                    Multiplication multiply = new Multiplication(num1, num2);
                    String result2 = Double.toString(multiply.execute());
                    Memory op3 = new Memory();
                    op3.getHistory().add(multiply);
                    out.println(result2);
                    break;

                case "divide":
                    int numb1 = Integer.parseInt(args1[1]);
                    int numb2 = Integer.parseInt(args1[2]);
                    Division div = new Division(numb1, numb2);
                    String result3 = Double.toString(div.execute());
                    Memory op4 = new Memory();
                    op4.getHistory().add(div);
                    out.println(result3);
                    break;

                case "memory":
                    Memory history = new Memory();
                    out.println(history.getHistory());
                    break;

                case "sin":
                    double angle = Double.parseDouble(args[1]);
                    Sin sin = new Sin(angle);
                    sin.execute();
                    Memory memory = new Memory();
                    memory.getHistory().add(sin);
                    out.println(sin);
                    break;

                case "cos":
                    double angle1 = Double.parseDouble(args[1]);
                    Cos cos = new Cos(angle1);
                    cos.execute();
                    Memory memory1 = new Memory();
                    memory1.getHistory().add(cos);
                    out.println(cos);

                case "tan":
                    double angle2 = Double.parseDouble(args[1]);
                    Tan tan = new Tan(angle2);
                    tan.execute();
                    Memory memory2 = new Memory();
                    memory2.getHistory().add(tan);
                    out.println(tan);

                default:
                    out.println("Unknown Operation");
            }
        }
    }
}

