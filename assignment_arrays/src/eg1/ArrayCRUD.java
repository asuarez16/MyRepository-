package eg1;



public class ArrayCRUD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]= new int[10]; 
		for (int i = 0; i < 7; i++) {
			ar[i]=i;
			
		}
		
		int n = 7;//use to keep track of elements in array 
		
		System.out.println("Before insertion");
		for (int i = 0; i < n; i++)
		{
			System.out.print(ar[i] + " ");
		}
		
		
	
		int ele = 100; //element to insert
		int pos = 1; //location in array to insert
		
		//shifts array elements from pos-1 to the right
		for ( int i=n; i>pos-1; i--)
		{
			ar[i] = ar[i-1];
		}
		
		ar[pos-1] = ele;// sets the new element at pos-1
		n++;//updateds our count
		
		System.out.println();
		
		System.out.println("After insertion");
		for (int i = 0; i < n; i++)
		{
			System.out.print(ar[i] + " ");
		}
		
		
		int delpos = 4; 
		for (int i = delpos-1; i < n; i++) {
			ar[i]=ar[i+1];
			
			
		}
		System.out.println();
		
		n--;
		System.out.println("after deletiong at position " + delpos);
		for (int i = 0; i < n; i++)
		{
			System.out.print(ar[i] + " ");
		}
		
	}

}
