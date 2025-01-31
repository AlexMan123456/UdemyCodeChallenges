package objectOrientedProgrammingPartOne;

public class Wall {
    private double width;
    private double height;


    // CONSTRUCTORS
    public Wall(double width, double height){
        this.width = width < 0 ? 0 : width;
        this.height = height < 0 ? 0 : height;
    }


    public Wall(){
        this(0,0);
    }


    // GETTERS
    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }


    // SETTERS
    public void setWidth(double width){
        this.width = width < 0 ? 0 : width;
    }

    public void setHeight(double height){
        this.height = height < 0 ? 0 : height;
    }


    // OTHER METHODS
    public double getArea(){
        return this.width*this.height;
    }
}
