package algorithms.strings;


import java.util.*;
public class GameofThrones1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k = new Scanner(System.in);
	    String str = k.nextLine();

	    Set<Character> set = new HashSet<Character>();
	    for(Character ch : str.toCharArray()){
	        if(set.contains(ch)){
	            set.remove(ch);
	        }else{
	            set.add(ch);
	        }
	    }

	    System.out.println((set.size()<=1)?"YES":"NO");


	    k.close();
	    
	    
	    /*
	     * HashSet<Character> hashSet = new HashSet<Character>();
for(int i=0;i<word.length();i++){
    if(hashSet.size() > (word.length()-i) + 1) return false;
    char character = word.charAt(i);
    if(hashSet.contains(character)){
        hashSet.remove(character);
    }else{
        hashSet.add(character);
    }
}
return hashSet.size() == word.length()%2;
	     */
	}

}
