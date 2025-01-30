package controlFlow;
import java.util.Arrays;

public class LargestPrime {
    // write code here
    public static int getLargestPrime(int number){
        if(number < 2){
            return -1;
        }

        int[] primeFactors = {};
        int numberCopy = number;
        for(int i=2; i<number; i++){
            while(numberCopy%i == 0){
                primeFactors = Arrays.copyOf(primeFactors, primeFactors.length+1);
                primeFactors[primeFactors.length-1] = i;
                numberCopy = numberCopy/i;
            }
        }
        
        if(primeFactors.length == 0){
            return -1;
        }

        return Arrays.stream(primeFactors).max().getAsInt();
    }

    public static void main(String[] args){
        getLargestPrime(23);
    }
}