
import java.util.Scanner;

public class Q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float erazer = sc.nextFloat();

        float TB = pen + pencil + erazer;

        System.err.println("Total bill is : "+TB);

        float GST = (TB*18/100);
        float G_TB = TB + GST;
        System.err.println("Total bill with GST is : "+G_TB);
    }
}