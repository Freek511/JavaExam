package bilet23;

public class Rectangle implements Figure{
    private double lenght;
    private double width;

    public Rectangle(double lenght, double width) {
        this.width= width;
        this.lenght = lenght;
    }

    @Override
    public double getArea() {
        return lenght*width;
    }

    @Override
    public double getPerimetr() {
        return 2*(lenght+width);
    }
    public String toString(){
        return "Rectangle:: Area = "+this.getArea() + " Perimeter = " + this.getPerimetr();
    }
}
