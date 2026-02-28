package geminiQuestion;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class question3 {

	public static void main(String[] args) {
		
		LinkedHashSet<String> sejarah = new LinkedHashSet<>();
		
		sejarah.add("Java");
		sejarah.add("Python");
		sejarah.add("Java");
		
		LinkedList<String> sejarahLL = new LinkedList<>();
		
		sejarahLL.add("Java");
		sejarahLL.add("Python");
		sejarahLL.add("Java");
		
		System.out.println(sejarah);
		
		System.out.println(sejarahLL);
		
	}

}
