import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = s.nextInt();
        System.out.println("Enter the second number");
        int b = s.nextInt();
        System.out.println("Enter the operator");
        String operator = s.next();
        switch (operator) {
            case "+" : System.out.println(a+b);
            break;
            case "-" : System.out.println(a-b);
            break;
            case "*" : System.out.println(a*b);
            break;
            case "/" : System.out.println(a/b);
            break;
            case "%" : System.out.println(a%b);
            break;
            default :
                System.out.println("Invalid operator");
        }
    }
}






