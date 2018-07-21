
public class _1_6_stringCompression {
	public static String compress(String str) {
		StringBuilder compressed = new StringBuilder();
		int countConsecutive = 0;
		for(int i = 0; i < str.length(); i++) {
			countConsecutive++;
			if(i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressed.append(str.charAt(i));
				compressed.append(countConsecutive);
				countConsecutive = 0;
			}
		}
		return str.length() < compressed.length() ? str : compressed.toString();
	}
	
	public static void main(String[] args) {
		String str = "aavvvvbbssfff";
		System.out.println(str);
		System.out.println(compress(str));
	
	}
}