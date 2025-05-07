package FirstProject;
class Rectangle {
    int length;
    int breadth;

    
    Rectangle() {
        length = 1;
        breadth = 1;
    }

    
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    // Method to calculate area
    int area() {
        return length * breadth;
    }
}

public class ConstructorEx {
    public static void main(String[] args) {
        // Creating rectangles using both constructors
        Rectangle rectDefault = new Rectangle();         // Uses default constructor
        Rectangle rectParam = new Rectangle(5, 10);      // Uses parameterized constructor

        // Displaying areas
        System.out.println("Area (default): " + rectDefault.area());
        System.out.println("Area (5,10): " + rectParam.area());
    }
}
