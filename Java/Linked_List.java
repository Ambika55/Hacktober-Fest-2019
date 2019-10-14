import java.util.*;
class link_list
	{
	public static void main(String g[])
		{
		LinkedList<Integer> obj=new LinkedList<Integer>();		
		LinkedList<String> S=new LinkedList<String>();		
		obj.add(100);
		obj.add(200);
		obj.add(300);
		obj.add(400);
		obj.add(500);
		S.add("Hello");
		S.add("Java");
		LinkedHashSet<LinkedList> H=new LinkedHashSet<LinkedList>();
		H.add(obj);
		H.add(S);		
		Iterator i=obj.iterator();
		while(i.hasNext())
			{
			Integer p=(Integer)i.next();
			System.out.println(p);			
			}		
		
		for(Integer d : obj)
			{
			System.out.println(d);
			}

		System.out.println(H);
		}

		}

	