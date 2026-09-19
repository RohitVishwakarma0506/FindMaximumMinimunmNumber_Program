import java.util.Scanner;

class   FindMaxMin
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of Arrays");

        int n = sc.nextInt();

        int num[] = new int[n];

        for(int i=0; i<n; i++)
        {
            num[i] = sc.nextInt();
        }
        int max = num[0];
        int min = num[0];

        for(int i=0; i<n; i++)
        {
            if(num[i] > max)
            {
                max = num[i];
            }
            if(num[i]<min)
            {
                min = num[i];
            }
        }
        System.out.println("minimum number is ="+min);
        System.out.println("Maximum number is ="+max);
    }
}