import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {

		int arr[]= {23,56,78,12,69};
		
		Arrays.sort(arr);
		
		String arrS[]= {"G","A","T","Q"};
		
		Arrays.sort(arrS);
		
		for(int i:arr)
			System.out.print("  "+i);
		
		for(String s:arrS)
			System.out.print(s+",  ");
	}

}
