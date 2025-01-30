package controlFlow;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        try (Scanner scanner = new Scanner(System.in)) {
            boolean exitLoop = false;
            int sum = 0;
            int loopCount = 1;
            do {
                try {
                    System.out.println("Please enter a number, or any non-numeric value to quit.");
                    sum = sum + Integer.parseInt(scanner.nextLine());
                    loopCount++;
                } catch(NumberFormatException err) {
                    loopCount = loopCount == 1 ? loopCount : loopCount - 1;
                    System.out.println(String.format("SUM = %d AVG = %d", sum, Math.round(Double.valueOf(sum)/loopCount)));
                    exitLoop = true;
                }
            } while(!exitLoop);
        }
    }

    public static void main(String[] args){
        inputThenPrintSumAndAverage();
    }
}
