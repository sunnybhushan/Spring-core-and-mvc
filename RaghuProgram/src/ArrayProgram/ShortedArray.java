package ArrayProgram;

public class ShortedArray {
	public static void main(String[] args) {
		int ar[] = { 10, 20, 30, 40, 50, 60 };
		int br[] = { 1, 2, 3, 4, 5, 6 };
		int cr[] = merge(ar, br);

		for (int i = 0; i < cr.length; i++) {
			System.out.print(cr[i] + " ");
		}
	}

	static int[] merge(int[] a, int[] b) {
		int i = 0, j = 0, k = 0;
		int cr[] = new int[a.length + b.length];
		while (i < a.length && j < b.length) {
			if (a[i] < b[j])
				cr[k++] = a[i++];
			else
				cr[k++] = b[j++];
		}

		while (i < a.length) {
			cr[k++] = a[i++];
		}
		while (j < b.length) {
			cr[k++] = b[j++];
		}

		return cr;
	}
}
