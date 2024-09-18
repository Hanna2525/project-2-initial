package com.csc205.project2;

public class Cylinder implements ThreeDimensionalShape {

    private double height;
    private double radius;

    // Default constructor
    public Cylinder() {
        super();
        this.height = 0.0;
        this.radius = 0.0;
    }

    // Parameterized constructor
    public Cylinder(double height, double radius) {
        super();
        this.height = height;
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

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Surface area calculation
    public double surfaceArea() {
        return 2.0 * Math.PI * radius * height + 2.0 * Math.PI * Math.pow(radius,2);}

    // volume calculation
    public double volume () {
        return Math.PI * Math.pow(radius,2) * height;}

    @Override
    public double getSurfaceArea() {
        return 0;
    }

    @Override
    public double getVolume() {
        return 0;
    }

    // toString method
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cylinder {");
        sb.append("height=").append(height);
        sb.append(", radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }

}