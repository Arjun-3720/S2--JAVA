//reverse of a number

class Reverse
{
    public static void main(String args[])
    {
        int n=5680;
        int rev=0;
        while(n!=0)
        {
	    rem = n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println("Reverse of the number is "+rev);
    }
}