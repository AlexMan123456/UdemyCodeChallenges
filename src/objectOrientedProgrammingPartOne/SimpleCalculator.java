package objectOrientedProgrammingPartOne;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;


    // GETTERS
    public double getFirstNumber(){
        return this.firstNumber;
    }

    public double getSecondNumber(){
        return this.secondNumber;
    }


    // SETTERS
    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }


    // EXTRA METHODS
    public double getAdditionResult(){
        return this.firstNumber + this.secondNumber;
    }

    public double getSubtractionResult(){
        return this.firstNumber - this.secondNumber;
    }

    public double getMultiplicationResult(){
        return this.firstNumber * this.secondNumber;
    }

    public double getDivisionResult(){
        if(this.secondNumber == 0){
            return 0;
        }
        return this.firstNumber / this.secondNumber;
    }
}
