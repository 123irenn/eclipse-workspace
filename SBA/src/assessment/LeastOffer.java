package assessment;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.*;

public class LeastOffer {

	public static void main(String[] args) throws IOException  {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n:");
		n=Integer.parseInt(br.readLine());
		int price[]=new int[n];
		int Dis[]=new int[n];
		String itemName[]=new String[n];
		//String[] values;
		float dis[]=new float[n];
		String[] input=new String[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter:");
			System.out.println();
			String s[]=br.readLine().split(",");
			
			itemName[i]=s[0];
			//System.out.println(itemName[i]);
			price[i]=Integer.parseInt(s[1]);
			//System.out.println(price[i]);
			Dis[i]=Integer.parseInt(s[2]);
			//System.out.println(Dis[i]);
			//float x=Dis[i];
			Dis[i]=(Dis[i]*price[i])/100;
		

		}
		int idx[]=new int[n];
		int j=0;
		float min=Float.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(dis[i]<=min)
		{
			min=Dis[i];
			idx[j++]=i;
			//System.out.println(min);
		}
		}
		for(int i=0;i<j;i++)
		{
			
			System.out.println(itemName[idx[i]]);
			//System.out.println(idx[i]);
		}

}
}
