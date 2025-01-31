package objectOrientedProgrammingPartOne;

public class Point {
    private int x;
    private int y;


    // CONSTRUCTORS
    public Point(int x, int y){
       this.x = x;
       this.y = y;
    }

    public Point(){
        this(0,0);
    }


    // GETTERS
    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }


    // SETTERS
    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }


    // DISTANCE METHODS
    public double distance(int x, int y){
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }

    public double distance(){
        return distance(this.x, this.y);
    }


    public double distance(Point point){
        return Math.sqrt(Math.pow(this.x-point.x,2) + Math.pow(this.y-point.y,2));
    }
}
