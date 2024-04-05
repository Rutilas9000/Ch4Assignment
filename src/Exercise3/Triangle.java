package Exercise3;

public class Triangle {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public boolean checkSides() throws IllegalTriangleSideException {
        if (this.side1 + this.side2 > this.side3 && this.side2 + this.side3 > this.side1 &&
                this.side1 + this.side3 > this.side2) {
            return true;
        }
        throw new IllegalTriangleSideException("ERROR: the sides do not fit the criteria for a triangle");
    }
}
