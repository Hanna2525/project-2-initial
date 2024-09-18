package com.csc205.project2;

public class Cube implements ThreeDimensionalShape {

    private double width;

    // Default constructor
    public Cube() {
        super();
        this.width = 0.0;
    }

    // Parameterized constructor
    public Cube(double width) {
        super();
        this.width = width;
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(double width) {
        this.width = width;
    }

    // Surface area calculation
public double surfaceArea () {
        return 6.0 * Math.pow (width,2);
}
       // volume calculation
public double volume (){
        return Math.pow(width,3);
}

    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public double getSurfaceArea() {
        return 0;
    }

    // toString method
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube {");
        sb.append("width=").append(width);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
