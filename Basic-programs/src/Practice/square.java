package Practice;

public class square {

	public static void main(String[] args) {
		int sum=0;
		for(int i=9;i<=40;i++)
		
		{
			sum =sum+i;}
			
		System.out.println(sum);
		    
			double area = (double)sum;
			double pi = 3.14;
			double rsq = area/pi;
			double r = Math.sqrt(rsq);
			
		System.out.println(r);
		
	}


}