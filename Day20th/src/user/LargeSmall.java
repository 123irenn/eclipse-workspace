package user;

public class LargeSmall {

	public static void main(String[] args) {
		String s="This is an umbrella";
		String l="";
		String small="";
		String arr[]=s.split(" ");
		/*for(int i=0;i<s.length();i++)
		{
			System.out.println(arr[i]);
		}*/
		int large=arr[0].length();
		int smaller=arr[0].length();
		 for(int i=1;i<arr.length;i++)
		 {
			 if(arr[i].length()>=large)
			 {
				 l=arr[i];
			 }
		 }
		System.out.println("Largest String: "+l);
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i].length()<=smaller)
			{
				small=arr[i];
			}
		}
		System.out.println("Smallest: "+small);
		// TODO Auto-generated method stub

	}

}
