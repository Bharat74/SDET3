package com.practice.programs;

public class LinearSearch {

	public static void main(String[] args) {
		int a[]= {57,99,78,32,54,12};
		int key=78;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(key==a[i]) {
				 System.out.println("Element found at:"+i);
				 flag=true;
				 break;
			}
			if(flag==false)
			{
				System.out.println("element not found");
			}
			
		}
		
		}

}
