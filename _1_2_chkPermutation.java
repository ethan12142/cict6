import java.util.Arrays;

public class _1_2_chkPermutation {
	public static String sort(String s) {
		char[] tmp = s.toCharArray();
		Arrays.sort(tmp);
		return new String(tmp);
	}
	public static boolean chP(String a, String b) {
		return sort(a).equals(sort(b));
	}
	public static void main(String[] args) {
		String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean anagram = chP(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + anagram);
		}
	}
}
