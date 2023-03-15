//Sum of odd numbers ranging from 1 to 99

public class SumOdd {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 99; i += 2) {
            sum += i;
        }
        System.out.println("The sum of the odd numbers ranging from 1 to 99 is: " + sum);
    }
}