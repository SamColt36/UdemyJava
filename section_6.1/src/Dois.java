import java.util.Scanner;

public class Dois {

	public static void main(String[] args) {
		int N, i, x, in=0, out=0;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		sc.close();
		for (i=1; i<=N; i++) {
			x = sc.nextInt();
			if (x>10 && x<20) {
				in = in +1;
			} 
			else {
				out = out +1;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
	}
}