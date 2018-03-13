package other;

public class Order {

	public static void main(String[] args) {

		order("test Fuck off Or");
	}

	public static String order(String words) {
		    if(words != ""){
		      String[] sa = words.split(" ");
		      
		      for(int a = 0; a < sa.length; a++){
		    	  System.out.println(sa[a]);
		      }
		      
		      
		      return "";
		    } else {
		      return "";
		    }
		}
}
