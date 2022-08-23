import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
	
	static Scanner fs;
	
	public static void main(String[] args) {
		fs = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int T = 1;
		//T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt();
			ArrayList<Integer>[] arr = new ArrayList[n];
			for (int i = 0; i < n; i++) {
				int d = fs.nextInt();
				arr[i] = new ArrayList<>();
				for (int x = 0; x < d; x++) {
					arr[i].add(fs.nextInt());
				}
			}
			int q = fs.nextInt();
			for (int i = 0; i < q; i++) {
				int x = fs.nextInt() - 1;
				int y = fs.nextInt() - 1;
				if (y < arr[x].size()) {
					out.println(arr[x].get(y));
				} else {
					out.println("ERROR!");
				}
			}
		}
		fs.close();
		out.close();
	}
	
	static void sort(int[] a) {
		ArrayList<Integer> arr = new ArrayList<>();
		for (int x : a) {
			arr.add(x);
		}
		Collections.sort(arr);
		for (int i = 0; i < a.length; i++) {
			a[i] = arr.get(i);
		}
	}
	
	static int[] readArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = fs.nextInt();
		}
		return a;
	}
}
