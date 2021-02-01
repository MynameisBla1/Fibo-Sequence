import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number that you want it to be the last " +
                "element of Fibonacci sequence(>=0): ");
        //get input from the user
        int nthNumber = scanner.nextInt();
        //output recursive method
        long startTime = System.nanoTime();
        System.out.println("Fibonacci sequence using recursive method:");
        int index = 0;
        while (index < nthNumber){
            System.out.print(fiboSeriesRec(index) + "  ");
            index++;
        }
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("\nTime took to execute recursive method in " +
                "milliseconds: " + timeElapsed/1_000_000);

        //output iteration method
        startTime = System.nanoTime();
        System.out.println("Fibonacci sequence using iteration method:");
        fiboSeriesIte(nthNumber);
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        System.out.println("\nTime took to execute iteration method in " +
                "milliseconds: " + timeElapsed/1_000_000);

    }
    //Recursive method
    static int fiboSeriesRec(int nthNumber){
        if (nthNumber==0){
            return 0;
        }
        if (nthNumber <= 2){
            return 1;
        }
        return fiboSeriesRec(nthNumber - 1) + fiboSeriesRec(nthNumber - 2);
    }

    //Iteration method
    static int fiboSeriesIte(int nthNumber){
        int a = 0, b = 1;
        int c;
        for (int i = 0; i < nthNumber; i++){
            System.out.print(a + "  ");
            c = a + b;
            a = b;
            b = c;
        }
        return 0;
    }

}
