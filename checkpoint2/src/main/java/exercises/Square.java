package exercises;

public class Square extends Shape{
    public Square(double height, double width){
        super(height,width);
    }

    @Override
    public double calculateArea() {
        double area = height*width;
        return area;
    }
}
