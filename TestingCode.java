import java.util.Arrays;
class tester{


	public static void main(String [] args){

		System.out.println((char)(82+2));

		System.out.println((int)'K' + 2);

		int [] arr = {69,22,42};
		
		System.out.println(arr[1]);		

		Arrays.sort(arr);		
		System.out.println(arr[1]);		

		System.out.println(!('r'>'a')?"cheese burger":"nope");

		int x = 69 ;
		int y = 42 ;
		System.out.println(" swaped before"+ x  + " " + y );

		swap(x,y);
		System.out.println(" swaped "+ x  + " " + y );



		String  w = "holy " ;
		String z = "cow" ;
		System.out.println(" swaped before"+ w + " " + z );

		swap(w,z);
		System.out.println(" swaped "+ w  + " " +z );


		//System.out.println(" swaped ".repeat());
		int[][] matrix = new int[2][5];

		System.out.println(" " + matrix.length + " "+ matrix[0].length);

	}

	public static void swap(int x , int y ){
		int temp = x;
		x = y;
		y = temp;
	}

	public static void swap(String x , String y ){
		String temp = x;
		x = y;
		y = temp;
	}

}


/*
[[1,2,3],
 [4,5,6],
 [7,8,9]]


[[1,4,7],
 [2,5,8],
 [3,6,9]]
 */