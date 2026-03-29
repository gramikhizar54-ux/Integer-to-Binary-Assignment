// BSSE-A-5655280-Syed Khizar Grami-72
import java.util.Scanner;
class Part1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if (num == 0)
        {
            System.out.println("Binary Representation : 0");
        }

        else
        {
            String bin = Integer.toBinaryString(num);
            System.out.println("Binary Representation: " + bin);
        }

        sc.close();
    }
}
