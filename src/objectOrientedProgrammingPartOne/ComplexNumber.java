package objectOrientedProgrammingPartOne;

public class ComplexNumber {
    private double real;
    private double imaginary;


    // CONSTRUCTOR
    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }


    // GETTERS
    public double getReal(){
        return this.real;
    }

    public double getImaginary(){
        return this.imaginary;
    }


    // OTHER METHODS
    public void add(double real, double imaginary){
        this.real = this.real + real;
        this.imaginary = this.imaginary + imaginary;
    }

    public void add(ComplexNumber complex){
        this.real = this.real + complex.real;
        this.imaginary = this.imaginary + complex.imaginary;
    }

    public void subtract(double real, double imaginary){
        this.real = this.real - real;
        this.imaginary = this.imaginary - imaginary;
    }

    public void subtract(ComplexNumber complex){
        this.real = this.real - complex.real;
        this.imaginary = this.imaginary - complex.imaginary;
    }
}
