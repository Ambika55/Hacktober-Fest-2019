import java.io.* ;
import java.util.* ;

public class GroupAnagramsTogether {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		//To check if two words are anagrams
		int i ;
		String s1 = "abcd" ;
		String s2 = "bcda" ;
		
		HashSet<Character> hs = new HashSet<>() ;
		if(s1.length()!=s2.length())
			System.out.println("NO") ;
		else {
			for(i=0;i<s1.length();i++) {
				char x = s1.charAt(i) ;
				hs.add(x) ;
			}
			for(i=0;i<s2.length();i++) {
				char x = s2.charAt(i) ;
				if(!hs.contains(x)) {
					System.out.println("NO") ;
					break ;
				}
			}
			System.out.println("YES") ;
		}
		int t = Integer.parseInt(br.readLine()) ;
		while(t-->0) {
			int n = Integer.parseInt(br.readLine()) ;
			String line = br.readLine() ;
			String[] str = line.trim().split("\\s+") ;
			
			LinkedHashMap<String,Integer> map = new LinkedHashMap<>() ;
			for(i=0 ; i<n ; i++) {
				char[] sch = str[i].toCharArray() ;
				Arrays.sort(sch) ;
				String sot = new String(sch) ;
				if(map.containsKey(sot))
					map.put(sot,map.get(sot)+1) ;
				else
					map.put(sot,1) ;
			}
			ArrayList<Integer> ans = new ArrayList<>() ;
			for(String s : map.keySet()) {
				ans.add(map.get(s)) ;
			}
			Collections.sort(ans);
			
			for(int k : ans) {
				System.out.print(k+" ");
			}
			//System.out.println(map.size());
			
		}
	}

}
