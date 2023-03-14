//fibonacci series

public class Fibonacci {
    public static void main(String[] args) {
        int limit = 15;
        
        int first = 0;
        int second = 1;
        
        System.out.print("Fibonacci series up to " + limit + " are"+": ");
        System.out.print(first + " " + second + " ");
        
        int third = first + second;
        while (third <= limit) {
            System.out.print(third + " ");
            first = second;
            second = third;
            third = first + second;
        }
    }
}