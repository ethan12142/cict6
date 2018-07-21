

public class _1_4_PalindromePermutation {
	public static boolean palindrome(String s) {
		int countOdd = 0;
		int[] table = new int[26];
		for(char c : s.toCharArray()) {
			int x = getCharNumer(c);
			if(x != -1) {
				table[x]++;
				if(table[x] % 2 == 1) {
					countOdd++;
				}
				else {
					countOdd--;
				}
			}
		}
		return countOdd <= 1;
	}
	private static int getCharNumer(char c) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val = Character.getNumericValue(c);
		if(a <= val && val <= z) return val - a;
		return -1;
	}
	public static void main(String[] args) {
		String pali = "Ratzs live on no evil starz";
		System.out.println(palindrome(pali));
		String pali2 = "Zeus was deified, saw Suez";
		System.out.println(palindrome(pali2));
	}		
}
