/*
Y Tran
COIS 2240, Assignment 1
Description: Prompt user input (nth value) then calculate a Fibonacci series of numbers using recursive method
and iteration method. Printing out the numbers up until the nth value.
*/

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number that you want it to be the last " +
                    "element of Fibonacci sequence: ");
        //get input from the user
        int nthNumber = scanner.nextInt();

        //utilize variable 'startTime' to get the system time before we execute the recursive method
        long startTime = System.nanoTime();
        //output recursive method
        System.out.println("Fibonacci sequence using recursive method:");
        //initialize variable 'index'
        int index = 0;
        //while index is smaller than the number the user entered
        while (index < nthNumber){
            System.out.print(fiboSeriesRec(index) + "  "); //call fiboSeriesRec and pass down +
            // value of index, then output all numbers in Fibonacci sequence up to nth number the user entered
            index++; //index increases by 1
        }
        //utilize variable 'endTime' to get the system time after we execute the recursive method
        long endTime = System.nanoTime();
        //get the time it took to run the method by subtracting startTime from endTime
        long timeElapsed = endTime - startTime;
        //convert time elapsed from nanoseconds to milliseconds then print out the time
        System.out.println("\nTime took to execute recursive method in " +
                "milliseconds: " + timeElapsed/1_000_000);

        //utilize variable 'startTime' to get the system time before we execute the iteration method
        startTime = System.nanoTime();
        //output iteration method
        System.out.println("Fibonacci sequence using iteration method:");
        //call fiboSeriesIte to get all numbers in Fibonacci sequence up to nth number the user entered
        fiboSeriesIte(nthNumber);
        ////utilize variable 'endTime' to get the system time after we execute the iteration method
        endTime = System.nanoTime();
        ////get the time it took to run the iteration method by subtracting startTime from endTime
        timeElapsed = endTime - startTime;
        //convert time elapsed from nanoseconds to milliseconds then print out the time
        System.out.println("\nTime took to execute iteration method in " +
                "milliseconds: " + timeElapsed/1_000_000);

    }
    /*Recursive method
    Description: Get the number the user entered, and basically the function calls itself, do the math
    to get a Fibonacci numbers
    Usage: in the main method
    Parameter(s): int nthNumber: get the number the user entered
    Return: int
    */
    public static int fiboSeriesRec(int nthNumber){
        //If the user enters 0 meaning they don't want no number showed, so return 0
        if (nthNumber==0){
            return 0;
        }
        //if the user a number less than or equal to 2, then return 1.
        if (nthNumber <= 2){
            return 1;
        }
        //return fib(previous number) + (fib previous previous number)
        return fiboSeriesRec(nthNumber - 1) + fiboSeriesRec(nthNumber - 2);
    }

    /*Iteration method
    Description: Get user input, add 2 previous numbers together, print out the sum
    Usage: in the main method
    Parameter(s):
    int previousNumber: get value of the former previous number
    int nextNumber: get value of the latter previous number
    int sum: sum of 2 previous number
    Return: 0
    */
    public static int fiboSeriesIte(int nthNumber){
        //initialize variables
        int previousNumber = 0, nextNumber = 1;
        int sum;
        //do the loop to get Fibonacci series of numbers up to nth number that the user entered
        for (int i = 0; i < nthNumber; i++){
            System.out.print(previousNumber + "  "); //output
            sum = previousNumber + nextNumber;//add 2 previous numbers together
            previousNumber = nextNumber; //next number becomes previous number
            nextNumber = sum;//sum of 2 previous numbers becomes next number
        }
        return 0;//return nothing
    }

}
