

public class _1_5_oneAway {
	public static boolean oneaway(String s1, String s2) {
		if(Math.abs(s1.length() - s2.length()) > 1) return false;
		String sS = s1.length() < s2.length() ? s1 : s2;
		String sL = s1.length() < s2.length() ? s2 : s1;
		
		int i1 = 0;
		int i2 = 0;
		boolean dif = false;
		while(i2 < sL.length() && i1 < sS.length()) {
			if(sS.charAt(i1) != sL.charAt(i2)) {
				if(dif) return false;
				dif = true;
				if(sS.length() == sL.length()) {
					i1++;
				}
			}
			else {
				i1++;
			}
			i2++;
		}
		return true;
	}
	public static void main(String[] args) {
		String a = "palee";
		String b = "pale";
		boolean isOneEdit1 = oneaway(a, b);
		System.out.println(a + ", " + b + ": " + isOneEdit1);

		String c = "pale";
		String d = "pkle";
		boolean isOneEdit2 = oneaway(c, d);
		System.out.println(c + ", " + d + ": " + isOneEdit2);
	}
}
