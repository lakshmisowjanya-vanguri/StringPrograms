import java.util.*;
class SortingTech
{
	 int size,i,j,temp;
	void selectionSort()
{
		Scanner s=new Scanner(System.in);
	       System.out.print("Enter Array Size");
	      int  size=s.nextInt();
	       int a[]=new int[size];
	       System.out.print("Enter Array Elements");
	       for(int i=0;i<size;i++)
	       {
	           a[i]=s.nextInt();
	       }
	       for(i=0;i<size;i++)
	       {
	           for(j=i+1;j<size;j++)
	           {
	               if(a[i]>a[j])
	               {
	                   temp=a[i];
	                   a[i]=a[j];
	                   a[j]=temp;
	               }
	           }
	       }
	       System.out.println("selection sort");
	       for(i=0;i<size;i++) {
	    	   System.out.print (a[i] + " ");
	       }
	       System.out.println();
}
	void bubbleSort() 
	{	
		Scanner s=new Scanner(System.in);
	       System.out.print("Enter Array Size");
	      int  size=s.nextInt();
	       int a[]=new int[size];
	       System.out.print("Enter Array Elements");
	       for(int i=0;i<size;i++)
	       {
	           a[i]=s.nextInt();
	       }
		for(i=0;i<(size-1);i++)
		{
	           for(j=0;j<(size-i-1);j++)
	           {
	               if(a[j]>a[j+1])
	               {
	                   temp=a[j];
	                   a[j]=a[j+1];
	                   a[j+1]=temp;
	               }
	           }
		}
	           System.out.println("Bubble Sort ");
	       for(i=0;i<size;i++)
	       {
	           System.out.print(a[i]+ "  ");
	       }
	   
	}
	void insertionSort() {
		Scanner s=new Scanner(System.in);
	    System.out.print("Enter Array Size");
	      int  size=s.nextInt();
	       int a[]=new int[size];
	       System.out.print("Enter Array Elements");
	       for(int i=0;i<size;i++)
	       {
	           a[i]=s.nextInt();
	       }
		for(i=1;i<size;i++)
	    {
	           temp=a[i];
	           j=i-1;
	           while((temp<a[j])&&(j>=0))
	           {
	               a[j+1]=a[j];
	               j=j - 1;
	           }
	           a[j+1]=temp;
	       }
		System.out.println("insertion sort");
	       for(i=0;i<size;i++)
	       {
	           System.out.print(a[i] +"  ");
	       }
	}
	/*void quickSort(int a[],int low,int high) {
		 int pivot = a[high];  
	        int i = (low-1); 
	        for (int j=low; j<high; j++) 
	        { 
	        if(a[j]<=pivot) {
	        	i++;
	        	temp=a[i];
	        	a[i]=a[j];
	        	a[j]=
	        }
	        }
	}*/
}
public class Sorting {
	public static void main(String args[]){
		
		SortingTech q=new SortingTech();
			q.selectionSort();
			q.bubbleSort();
			q.insertionSort();
			//q.quickSort(a, low, high);
	}
}

