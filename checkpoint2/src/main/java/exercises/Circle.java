package exercises;

public class Circle extends Shape{
    public Circle(double height, double width){
        super(height,width);
    }

    @Override
    public double calculateArea() {
        double area = 2*Math.PI*height*width;
        return area;
    }
}
