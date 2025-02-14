

import java.util.Scan;
class SumEven
{
	public static void main(String[] args)
	{
		Scan input = new Scan(System.in);
		System.out.print("Enter the limit value : ");
		int n =input.nextInt();
		int sum = 0;
		for(int s=1;s<=n;s++)
		{
			if(s%2==0)
				sum +=   s;
 
		}
		System.out.println("Sum of Even Numbers :"+ sum);
	}
}