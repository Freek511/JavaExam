package bilet23;

public class Circle implements Figure{
    private double radius;

    public Circle(double radius) {
        this.radius= radius;
    }
    @Override
    public double getArea()
    {
        return 3.14*radius*radius;
    }

    @Override
    public double getPerimetr() {
        return 2*3.14*radius;
    }

    public String toString(){
        return "Circle:: Area = "+this.getArea() + " Perimeter = " + this.getPerimetr();
    }
}
