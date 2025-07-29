public class OOP {                 // main class OOP

    class Pen {                   // inner class Pen
        String color;             // property color
        int tip;                  // property tip size

        // Setter for color
        void setColor(String newColor) {
            color = newColor;
        }

        // Setter for tip
        void setTip(int newTip) {
            tip = newTip;
        }

        // Getter for color
        String getColor() {
            return color;
        }

        // Getter for tip
        int getTip() {
            return tip;
        }

        // Method to display pen details
        void display() {
            System.out.println("Pen color: " + color);
            System.out.println("Pen tip size: " + tip);
        }
    }

    public static void main(String[] args) {
        OOP outer = new OOP();           // create an instance of the outer class
        OOP.Pen myPen = outer.new Pen(); // create an instance of inner class Pen

        myPen.setColor("Blue");          // choose color
        myPen.setTip(5);                 // set tip size

        myPen.display();                 // display pen details
    }                                    // end of main method
}
//