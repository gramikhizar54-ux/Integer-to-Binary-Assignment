//BSSE-A-5655280-Syed Khizar Grami-72
import java.util.Scanner;
class Part3
{    
    public static String getBinaryString(int num)
    {
        if (num == 0)
        {
            return "0";
        }

        String bin = Integer.toBinaryString(num);

        return bin;
    }

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        String result = getBinaryString(num);

        System.out.println("Binary Representation: " + result);

        sc.close();
    }
}