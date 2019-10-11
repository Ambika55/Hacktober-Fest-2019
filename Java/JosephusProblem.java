
import java.io.* ;
import java.util.* ;

public class JosephusProblem {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		int t = Integer.parseInt(br.readLine()) ;
		while(t-->0) {
			String line = br.readLine() ;
			String[] str = line.trim().split("\\s+") ;
			int n = Integer.parseInt(str[0]) ;
			int k = Integer.parseInt(str[1]) ;
			
			System.out.println(josephus(n,k,1)) ;
		}
	}
	public static int josephus(int n,int k,int start) {
        List<Integer> p = new LinkedList<Integer>();
        for(int i=0; i<n; i++)
            p.add(i+1);

        List<Integer> r = new LinkedList<Integer>();
        int i = (start - 2) % n;
        for (int j=n; j>0; j--) {
            i = (i+k)%n--;
            r.add(p.remove(i--));
        }
        return r.get(r.size()-1) ;
	}

}
