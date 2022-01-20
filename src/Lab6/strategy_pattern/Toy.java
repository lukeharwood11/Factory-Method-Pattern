package Lab6.strategy_pattern;

public abstract class Toy {

    protected double listPrice;
    protected double costToMake;

    public Toy() {

    }

    abstract void orderParts();

    abstract void assemble();

    public double getCostToMake() {
        return this.costToMake;
    }

    public double getListPrice() {
        return this.listPrice;
    }
}
