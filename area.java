class Rectangle{
    private double length;
    private double width;

    public void setLength(double length){
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double calculateArea(){
        return length * width;
    }
}
public class Main{
    public static void main(String[] args){
        Rectangle rect = new Rectangle();
        rect.setLength(5.0);
        rect.setWidth(7.0);

        System.out.println("Area of the rectangle: " +rect.calculateArea());
    }
}
