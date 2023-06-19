package in.ineuron.question;

public class Question1 {
	public static int firstNonRepeatChar(String s) {
		int[] count = new int[128];

		for (final char c : s.toCharArray())
			++count[c];

		for (int i = 0; i < s.length(); ++i)
			if (count[s.charAt(i)] == 1)
				return i;

		return -1;
	}
	public static void main(String[] args) {
        String str1 = "aabb";
        System.out.println("Index of first non-repeating character in '" + str1 + "' is: " + firstNonRepeatChar(str1));
    }
}
