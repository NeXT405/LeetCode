package bis20;

public class Level014LogestCommonPrefix {

	public static void main(String[] args) {
		String[] strArray = { "teddd", "tetststring", "testetringasd", "testetring", "testetr", "tets", "tehallotet" };
//		String[] strArray2 = { "a", "a" };
		System.out.println(longestCommonPrefix(strArray));
	}

	public static String longestCommonPrefix(String[] strs) {
		
		if(strs.length == 0){
			return "";
		} else if(strs.length == 1){
			return strs[0];
		}
		
		String ret = "";
		String l = strs[0];
		int count = 0;
		
		while (l.length() > 0) {
			for(int a = 1; a < strs.length; a++){
				if(strs[a].startsWith(l)){
					count++;		
					if(count == strs.length-1 && l.length()>ret.length()){
						ret = l;
					}
				}
			}
			count = 0;
			l = l.substring(0, l.length() - 1);
		}
		return ret;
	}

}
