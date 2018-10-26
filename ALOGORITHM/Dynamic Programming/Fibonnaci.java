
public class fibonacci {
	public static void main(String[] args) {
		int n = 5;
		int[] strg = new int[n + 1];
		System.out.println(fb(n, strg));
	}
public static int fb(int n, int[] strg) {
    if (n == 1 || n == 0) {
        return n;
    }
    if (strg[n] != 0) {
        return strg[n];
    }
    int f1 = fb(n - 1, strg);
    int f2 = fb(n - 2, strg);
    int fn = f2 + f1;
    strg[n] = fn;
    return fn;
}
