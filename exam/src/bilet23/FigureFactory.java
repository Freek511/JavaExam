package bilet23;

public class FigureFactory {
    public static Figure getFigure(String type){
        if("Circle".equalsIgnoreCase(type)){
            return new Circle(5);
        }
        else if("rectangle".equalsIgnoreCase(type)){
            return new Rectangle(4,5);
        }
        return null;
    }

    public static void main(String[] args){
        Figure circ = FigureFactory.getFigure("circle");
        Figure rect = FigureFactory.getFigure("rectangle");
        System.out.println(circ);
        System.out.println(rect);
    }
}
