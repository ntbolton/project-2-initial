package com.csc205.project2;

public class Cylinder extends Shape {

    private double height;
    private double radius;

    public Cylinder() {
        super();
        this.height = 0.0;
        this.radius = 0.0;
    }

    public Cylinder(double h, double r) {
        super();
        this.height = h;
        this.radius = r;
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public void setHeight(double h) {
        this.height = h;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    @Override
    public double surfaceArea() {
        // surface area of cylinder is A = 2πrh+2πr^2
        return (2.0 * Math.PI * radius * height) + (2.0 * Math.PI * Math.pow(radius, 2.0));
    }

    @Override
    public double volume() {
        // volume of cylinder is V = π(r^2)h
        return (2.0 * Math.PI * Math.pow(radius, 2.0) * height);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cylinder {");
        sb.append("height = ").append(height);
        sb.append(", radius = ").append(radius);
        sb.append(", surface area = ").append(surfaceArea());
        sb.append(", volume = ").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
