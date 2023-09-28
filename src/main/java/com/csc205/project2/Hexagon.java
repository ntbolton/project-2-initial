package com.csc205.project2;

public class Hexagon extends Shape {

    private double height;
    private double baseEdge;

    public Hexagon() {
        super();
        this.height = 0.0;
        this.baseEdge = 0.0;
    }

    public Hexagon(double a, double h) {
        super();
        this.baseEdge = a;
        this.height = h;
    }

    public double getHeight() {
        return height;
    }

    public double getBaseEdge() {
        return baseEdge;
    }

    public void setHeight(double h) {
        this.height = h;
    }

    public void setBaseEdge(double a) {
        this.baseEdge = a;
    }

    @Override
    public double surfaceArea() {
        // surface area of a hexagonal prism is A = 6*ah+3* √(3) * a^2
        return ((6.0 * baseEdge * height) + 3.0 * Math.sqrt(3.0) * Math.pow(baseEdge, 2.0));
    }

    @Override
    public double volume() {
        // volume of a hexagonal prism is V = ( (3 * √3) / 2) * a^2 * h
        return (((3.0 * Math.sqrt(3)) / 2) * Math.pow(baseEdge, 2.0) * height);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Hexagon {");
        sb.append("height = ").append(height);
        sb.append(", baseEdge = ").append(baseEdge);
        sb.append(", surface area = ").append(surfaceArea());
        sb.append(", volume = ").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
