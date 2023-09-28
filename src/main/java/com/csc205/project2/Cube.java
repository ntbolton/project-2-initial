package com.csc205.project2;

/* ---------------------------------------------------------------------------------------------------
Prompt given to ChatGPT for surfaceArea() and volume() methods:
"Can you generate surfaceArea() and volume() methods for a cube in java using the variable "width"?"
ChatGPT then created the surfaceArea() and volume() methods that I will use with the width variable.
------------------------------------------------------------------------------------------------------ */

public class Cube extends Shape {

    private double width;

    public Cube() {
        super();
        this.width = 0.0;
    }

    public Cube(double w) {
        super();
        this.width = w;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double w) {
        this.width = w;
    }

    @Override
    public double surfaceArea() {
        // Surface area of a cube: 6 * (side length)^2
        return 6 * Math.pow(width, 2.0);
    }


    @Override
    public double volume() {
        // Volume of a cube: (side length)^3
        return Math.pow(width, 3.0);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube {");
        sb.append("width = ").append(width);
        sb.append(", surface area = ").append(surfaceArea());
        sb.append(", volume = ").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
