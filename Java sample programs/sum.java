//Sum of digits

class Sum {
    public static void main(String args[])
    {
        int n=3452;
        int sum=0;
        while(n!=0)
        {
	    rem = n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println("Sum of the digits is "+sum);
    }
    
}