public class fibonacci {
	public static void main(String[] args) {
		System.out.println(longestcommonsequence("aabbaa", "abbaa"));
    }
    public static int longestcommonsequence(String str1, String str2) {
		if (str1.length() == 0 || str2.length() == 0) {
			return 0;
		}
		int count = 0;
		String ros1 = str1.substring(1);
		String ros2 = str2.substring(1);
		if (str1.charAt(0) == str2.charAt(0)) {
			count = 1 + longestcommonsequence(ros1, ros2);
		} else {
			int f1 = longestcommonsequence(str1, ros2);
			int f2 = longestcommonsequence(ros1, str2);
			count = Math.max(f1, f2);
		}
		return count;
	}
