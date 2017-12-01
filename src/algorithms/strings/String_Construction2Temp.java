package algorithms.strings;

import java.util.HashSet;

public class String_Construction2Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = null;
		int slen = s.length();
        //HashSet<Charector> hs = new HashSet<Charector>();
        HashSet hs = new HashSet();
        for(int i=0;i<slen;i++)
        {
            hs.add(s.charAt(i));
        }      
        int cost = hs.size();
        
	}

}
