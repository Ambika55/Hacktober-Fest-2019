import java.io.* ;

public class TwoOddNumsInArray {

	public static void main(String[] args) throws IOException{
	/*	OUTPUT :
	    1
		8
		1 1 2 2 4 5 6 6
		INPUT : 
		x : 5
		y : 4   */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		int i,t = Integer.parseInt(br.readLine()) ;
		
		while(t-->0) {
			int n = Integer.parseInt(br.readLine()) ;
			int[] arr = new int[n] ;
			String line = br.readLine() ;
			String[] str = line.trim().split("\\s+") ;
			for(i=0 ; i<n ; i++)
				arr[i] = Integer.parseInt(str[i]) ;
			int xor = arr[0] ;
			for(i=1 ; i<n ; i++)
				xor = xor^arr[i] ;
			int x = 0,y = 0 ;
			int set_bit_no = xor & ~(xor-1) ;
			
			for(i=0 ; i<n ; i++) {
				if( (arr[i]&set_bit_no)>0 ) {
					x = x^arr[i] ;
				}else {
					y = y^arr[i] ;
				}
			}
			System.out.println("x : "+x+"\ny : "+y) ;
		}
	}
}
