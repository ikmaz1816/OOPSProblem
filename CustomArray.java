package problemOnOops;

public class CustomArray {
	int[] arr;
	int index;
	public CustomArray()
	{
		arr=new int[5];
		this.index=0;
	}
	public int size()
	{
		return index;
	}
	public boolean isEmpty()
	{
		return index==0;
	}
	public void add(int value)
	{
		if(index==arr.length)
		{
			doubleArray();
		}
		arr[index++]=value;
	}
	private void doubleArray() {
		int[] arr1=arr;
		arr=new int[arr1.length * 2];
		for(int i=0;i<arr1.length;i++)
		{
			arr[i]=arr1[i];
		}
		
	}
	public void set(int index,int value)
	{
		if(index>=arr.length)
			return;
		for(int i=this.index;i>=index;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[index]=value;
	}
	public void remove(int value)
	{
		index--;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==value)
			{
				for(int j=i;j<arr.length;j++)
				{
					arr[j]=arr[j+1];
					if(arr[j]==0)
						return;
				}
			}
		}
	}
	public void print()
	{
		for(int i=0;i<index;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		CustomArray arr=new CustomArray();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		
		arr.print();
		
		System.out.println(arr.isEmpty());
		
		System.out.println(arr.size());
		
		arr.remove(3);
		
		arr.print();
		
		arr.set(3,3);
		
		arr.print();
	}

}
