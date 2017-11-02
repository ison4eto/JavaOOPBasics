package Encapsulation.exercise.p01_class_box;

public class Box {
    private double length;
    private double width;
    private double height;

    Box(){

    }
    Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    public double getLength() {
        return length;
    }

    private void setLength(double length) {
        if(length<=0){
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    private void setWidth(double width) {
        if(width<=0){
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    private void setHeight(double height) {
        if(height<=0){
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }

    private double getLateralArea(){
        return 2 * (length*height+width*height);
    }
    private double getSurfaceArea(){
        return 2*length*width + getLateralArea();
    }
    private double getVolume(){
        return width*height*length;
    }

    @Override
    public String toString() {
        return String.format("Surface Area - %.2f%nLateral Surface Area - %.2f%nVolume - %.2f",
                this.getSurfaceArea(),
                this.getLateralArea(),
                this.getVolume());
    }
}
