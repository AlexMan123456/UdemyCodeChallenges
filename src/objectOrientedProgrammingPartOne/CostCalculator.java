package objectOrientedProgrammingPartOne;

public class CostCalculator {
    private Floor floor;
    private Carpet carpet;

    public CostCalculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return floor.getArea()*carpet.getCost();
    }
}
