//BSSE-A-5655280-Syed Khizar Grami-72
import java.util.Scanner;
class Part2
{
    public static int[] getBinaryArray(int num)
    {
        if (num == 0)
        {
            return new int[]{0};
        }

        String bin = Integer.toBinaryString(num);

        int[] binArray = new int[bin.length()];

        for (int i = 0; i < bin.length(); i++ )
        {
            binArray[i] = bin.charAt(i) - '0';
        }

        return binArray;
    } 

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int[] result = getBinaryArray(num);

        System.out.print("Binary Representation: ");

        for (int digit : result)
        {
            System.out.print(digit);
        }

        sc.close();
    }

}