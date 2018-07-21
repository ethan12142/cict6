
public class _1_1_isUnique {
	public static boolean isUniChar(String str) {
		if(str.length() > 128)
			return false;
		boolean[] ch = new boolean[128];
		for(int i = 0; i < str.length(); i++) {
			int chk = str.charAt(i);
			if(ch[chk]) return false;
			ch[chk] = true;
		}
		return true;
	}
	public static boolean isUwithoutAddSpace(String str) {
		if(str.length() > 26) return false;
		int tmp =0;
		for(int i = 0; i < str.length(); i++) {
			int chk = str.charAt(i) - 'a';
			if((tmp & (1 << chk)) > 0) return false;
			tmp |= (1 << chk);
		}
		return true;
	}
	public static void main(String[] args) {
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for(String word : words) {
			System.out.println(word + ":" + isUniChar(word));
			System.out.println(word + ":" + isUwithoutAddSpace(word));
		}
	}
}
