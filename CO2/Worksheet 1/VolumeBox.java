//Volume of a box using parameters and return value in method
import java.util.Scanner;

class Volume {
    int l,b,h;
    void assign() {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter length:");
        l=scan.nextInt();
        System.out.print("Enter breadth:");
        b=scan.nextInt();
        System.out.print("Enter height:");
        h=scan.nextInt();
        scan.close();
    }

    int volu(){
        int voll=l*b*h;
        return voll;
    }
}

public class VolumeBox {
    public static void main(String args[]) {
        Volume obj1=new Volume();
        obj1.assign();
        
        int result=obj1.volu();
        System.out.println("Volume of the box: " + result);
    }
}