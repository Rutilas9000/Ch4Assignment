package Exercise3;

public class TriangleTester {
    public static void main(String[] args) {
        try {
            Triangle triangle1 = new Triangle(3, 4, 5);
            System.out.println("Triangle 1 is valid: " + triangle1.checkSides());

            Triangle triangle2 = new Triangle(7, 10, 5);
            System.out.println("Triangle 2 is valid: " + triangle2.checkSides());

            Triangle triangle3 = new Triangle(1, 2, 3);
            System.out.println("Triangle 3 is invalid: " + triangle3.checkSides());

        }
        catch (IllegalTriangleSideException e) {
            System.out.println(e);
        }
    }
}
