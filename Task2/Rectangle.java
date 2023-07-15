package Task2;

public class Rectangle {

    private static final double DEFAULT_HEIGHT = 10f;
    private static final double DEFAULT_WIDTH = 10f;

    private double height;
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }

    private double width;
    public double getWidth(){
        return width;
    }
    public void setWidtht(double width){
        this.width = width;
    }
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
    public Rectangle(){
        this(DEFAULT_HEIGHT, DEFAULT_WIDTH);
    }
    public double calculateArea(){
        return height * width;
    }
    public double calculatePerimeter(){
        return (height + width) * 2;
    }
}
