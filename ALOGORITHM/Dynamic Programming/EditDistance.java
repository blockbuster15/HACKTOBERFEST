public class EditDistance {
	public static void main(String[] args) {
		System.out.println(EditDistance("cat", "bat"));
	}
public static int EditDistance(String s1, String s2) {
    if (s1.length() == 0) {
        return s2.length();
    }
    if (s2.length() == 0) {
        return s1.length();
    }
    String ros1 = s1.substring(1);
    String ros2 = s2.substring(1);
    int ans = 0;
    if (s1.charAt(0) == s2.charAt(0)) {
        ans = EditDistance(ros1, ros2);
    } else {
        int f1 = EditDistance(ros1, ros2); // replace
        int f2 = EditDistance(ros1, s2); // add
        int f3 = EditDistance(s1, ros2); // remove
        ans = Math.min(f1, Math.min(f2, f3));
    }
    return ans;
}