//prime number program

public class Prime
{
    public static void main(String args[])
    {
        int i,j;
        System.out.print("Prime nos are:");
        for(i=2;i<=100;i++)
        {
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    break;
                }
            }
            if(i==j)
            {
                System.out.println(i);
            }
        }
    }
}