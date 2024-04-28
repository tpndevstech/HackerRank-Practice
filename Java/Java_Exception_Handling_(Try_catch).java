import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        try {
            int a = input.nextInt();
            int b = input.nextInt();
            int result = a / b;
            System.out.println(result);
        } catch (java.util.InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } catch (java.lang.ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}
