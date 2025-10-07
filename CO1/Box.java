
public class Box 
{
// Fields (properties)
    private double width;
    private double height;
    
    // Method to set dimensions
    public void setDimensions(double w, double h) {
        width = w;
        height = h;    }

    // Method to display dimensions
    public void display() {
        System.out.println("Width: " + width + ", Height: " + height);    }
}
// Main.java
public class Main {
    public static void main(String[] args) {
        Box b1 = new Box(); // Object created
        // b1.setDimensions(5.5, 7.3); // Calling method using object
        b1.display(); // Accessing method
    }
}
