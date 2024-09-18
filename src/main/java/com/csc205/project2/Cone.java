package com.csc205.project2;

public class Cone implements ThreeDimensionalShape {

    private double radius;
    private double height;

    // Default constructor
    public Cone() {
        super();
        this.radius = 0.0;
        this.height = 0.0;
    }

    // Parameterized constructor
    public Cone(double radius, double height) {
        super();
        this.radius = radius;
        this.height = height;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }
    //surfaceArea calculation
   public double surfaceArea(){
    return Math.PI * radius * ( radius + Math.sqrt(Math.pow(height,2)+ Math.pow(radius,2)));
}

     //Volume calculation
   public double volume (){
        return (1.0/3.0)* Math.PI * Math.pow (radius,2) * height;
}

    @Override
    public double getSurfaceArea() {
        return surfaceArea();
    }

    @Override
    public double getVolume() {
        return volume();
    }

    // toString method
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cone {");
        sb.append("radius=").append(radius);
        sb.append(", height=").append(height);
        sb.append(", surface area=").append(getSurfaceArea());
        sb.append(", volume=").append(getVolume());
        sb.append('}');
        return sb.toString();
    }
}
