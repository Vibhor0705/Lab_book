package lab7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Lab7Exercise1 {

	public static void main(String[]args)
	{
		HashMap map=new HashMap();
		map.put(1, 5);
		map.put(2,4);
		map.put(3,7);
		System.out.println(sol(map));
	}

	private static List sol(HashMap map) {
		
		Collection l=map.values();
		List list=new ArrayList(l);
		Collections.sort(list);
		return list;
		
	}
}
