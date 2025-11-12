package i;
import java.util.Scanner;


public class sem7_prac {
    static int recursiveSteps = 0;

    static int fibRecursive(int n) {
        recursiveSteps++;
        if (n <= 1)
            return n;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // Iterative
        long first = 0, second = 1, next;
        int iterativeSteps = 0;
        for (int i = 2; i <= n; i++) {
            next = first + second; iterativeSteps++;
            first = second; iterativeSteps++;
            second = next; iterativeSteps++;
        }
        System.out.println("Iterative Steps: " + iterativeSteps);

        // Recursive
        recursiveSteps = 0;
        fibRecursive(n - 1);
        System.out.println("Recursive Steps: " + recursiveSteps);
    }
}
