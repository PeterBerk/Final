import TerminalIO.*;
/**
 * Created by peter on 21/01/15.
 */
public class SimpleFib {
    static KeyboardReader kr = new KeyboardReader();

    static int fib(int n){
        if (n <= 2) return 1;
        else return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args){
        while (true){
            int n = kr.readInt("How many fibonacci numbers would you like to count to? (0 to quit): \n");
            if (n<0) {
                System.out.println("Error: Input '1' or higher");
            }
            else if (n==0){
                break;
            }
            else{
                System.out.println("Counting... Please wait...");
                System.out.println("The " + n + "the fibonacci number is " + fib(n));
            }
        }
    }
}
