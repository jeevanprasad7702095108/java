package program;

public class Duplicateelementinanarray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,10};
		int count=0;
		int duplicate=20;
		for(int i=0;i<a.length;i++)
		{
			if(duplicate==a[i])
			{
				count++;
			}
		}
		System.out.println(count);
		
		
				
		}

	}


