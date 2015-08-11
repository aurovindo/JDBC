import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class StringTokenizerDemo {
	
	public static void main(String[] args){
		
		String str = "name=arbind;title=sahu";
		Map<String, String> tokenMap = new HashMap<String, String>();
		String[] splits = null;
		
		StringTokenizer token = new StringTokenizer(str,";");
		while(token.hasMoreTokens()){
			String element = token.nextToken();
			splits = element.split("=");
			tokenMap.put(splits[0], splits[1]);
			System.out.println(tokenMap.toString());
			System.out.println("Yes I do it successfully");
		}
		
	}
}
