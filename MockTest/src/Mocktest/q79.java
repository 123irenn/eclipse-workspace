package Mocktest;
//selection sort
public class q79 {

	public static void main(String[] args) {
		 int a[]= {2,5,1,6,3};
         int i,j,min;
         for( i=0;i<a.length-1;i++)
         {
             min=i;
             for( j=i+1;j<a.length;j++)
             {
                 if(a[j]<a[min])
                 {
                     min=j;
                 }
             }
             if(min!=i)
             {
                 int temp=a[i];
                 a[i]=a[min];
                 a[min]=temp;
             }            
         }
         for ( i=0;i<a.length;i++)
         {
             System.out.println(a[i]);
         }
     
		// TODO Auto-generated method stub

	}

}
