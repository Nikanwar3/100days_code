// public class OOP {                 // main class OOP

//     class Pen {                   // inner class Pen
//         String color;             // property color
//         int tip;                  // property tip size

//         // Setter for color
//         void setColor(String newColor) {
//             color = newColor;
//         }

//         // Setter for tip
//         void setTip(int newTip) {   //tip 
//             tip = newTip;
//         }

//         // Getter for color
//         String getColor() {
//             return color;
//         }

//         // Getter for tip
//         int getTip() {
//             return tip;
//         }

//         // Method to display pen details
//         void display() {
//             System.out.println("Pen color: " + color);
//             System.out.println("Pen tip size: " + tip);
//         }
//     }

//     public static void main(String[] args) {
//         OOP outer = new OOP();           // create an instance of the outer class
//         OOP.Pen myPen = outer.new Pen(); // create an instance of inner class Pen

//         myPen.setColor("Blue");          // choose color
//         myPen.setTip(5);                 // set tip size

//         myPen.display();                 // display pen details
//     }                                    // end of main method
// }
// //

public class OOP {

    // Interface for common writing tools
    interface WritingTool {
        void write(String text);
        void display();
    }

    // Abstract inner class for shared properties
    abstract class Tool implements WritingTool {
        private String brand;

        public Tool(String brand) {
            this.brand = brand;
        }

        public String getBrand() {
            return brand;
        }

        @Override
        public void write(String text) {
            System.out.println("Writing: " + text);
        }
    }

    // Non-static inner class: Pen
    public class Pen extends Tool {
        private String color;
        private int tip;

        public Pen(String brand, String color, int tip) {
            super(brand);
            this.color = color;
            this.tip = tip;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setTip(int tip) {
            this.tip = tip;
        }

        public String getColor() {
            return color;
        }

        public int getTip() {
            return tip;
        }

        @Override
        public void display() {
            System.out.println("Brand: " + getBrand());
            System.out.println("Pen Color: " + color);
            System.out.println("Pen Tip Size: " + tip + " mm");
        }

        // Overloaded write method
        public void write(String text, boolean uppercase) {
            if (uppercase) {
                text = text.toUpperCase();
            }
            super.write(text);
        }
    }

    // Static inner class: Pencil (doesn’t need OOP instance)
    public static class Pencil implements WritingTool {
        private String hardness;

        public Pencil(String hardness) {
            this.hardness = hardness;
        }

        @Override
        public void write(String text) {
            System.out.println("Pencil writing softly: " + text);
        }

        @Override
        public void display() {
            System.out.println("Pencil hardness: " + hardness);
        }
    }

    // Main method
    public static void main(String[] args) {
        // Non-static inner class requires outer instance
        OOP outer = new OOP();
        Pen myPen = outer.new Pen("Reynolds", "Blue", 0.7);

        myPen.display();
        myPen.write("Hello World!");
        myPen.write("hello polymorphism", true);

        System.out.println("-----------");

        // Static inner class can be created directly
        Pencil myPencil = new OOP.Pencil("HB");
        myPencil.display();
        myPencil.write("Sketching a design");
    }
}