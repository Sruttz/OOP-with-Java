//Implement Volume of a box using this keyword
public class Box {
    double length,breadth,width;
     public Box(double length, double width, double breadth) {
         this.length = length;
         this.width = width;
         this.breadth = breadth;
     }
     public double calculateVolume() {
         double volume = this.length * this.width * this.breadth;
         return volume;
     }
 
     public static void main(String[] args) {
         Box myBox = new Box(5.0, 3.0, 2.0);
         double volume = myBox.calculateVolume();
         System.out.println("Volume of the box: " + volume);
     }
 }