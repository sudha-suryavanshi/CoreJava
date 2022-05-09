package onlineVideo;

public class MultiArrayDemo {

	public static void main(String[] args) {
		int d[][] = {

				{ 1, 2, 3, 4 }, { 2, 4, 6, 9 }, { 12, 45, 6, 40 } };
		
		//System.out.println(d[0][3]);
		for(int i=0;i<3;i++)// Display rows
		{
			
			for(int j=0;j<4;j++)//Display columns
			{
				System.out.print("  "+d[i][j]);
			}
			System.out.println();
		}
	}

}
