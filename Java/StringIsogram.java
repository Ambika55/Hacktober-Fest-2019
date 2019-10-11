import java.io.* ;
import java.util.* ;

public class StringIsogram {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		int t = Integer.parseInt(br.readLine()) ;
		
		while(t-->0) {
			String text = br.readLine() ;
			System.out.println(checkIsogram(text)) ;
		}
	}
	static int checkIsogram(String input) {
		int n = input.length() ;
		Map<Character,Integer> map = new HashMap<Character,Integer>() ;
		for(int i=0 ; i<n ; i++) {
			if(map.keySet().contains(input.charAt(i))) {
				map.put(input.charAt(i), map.get(input.charAt(i))+1) ;
			}else {
				map.put(input.charAt(i),1) ;
			}
		}
		for(Map.Entry<Character,Integer> entry : map.entrySet()) {
			Integer freq = entry.getValue() ;
			if( freq > 1 ) {
				return 0 ;
			}
		}
		return 1 ;
	}
}
