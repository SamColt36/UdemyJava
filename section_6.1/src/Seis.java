import java.util.Scanner;

public class Seis {

	public static void main(String[] args) {
		int n, i, z;
		Scanner sc =  new Scanner(System.in);
		n = sc.nextInt();
		sc.close(); 
		// ESSE TRECHO RETORNA COMO SAÍDA DIVISORES NA ORDEM DECRESCENTE
		/*
		for (i=1; i<=n; i++) {
			z = n/i;
			if (n % i == 0) {
				System.out.println(z);
			}
		}
		*/ 
		// ESSE TRECHO RETORNA COMO SAÍDA DIVISORES NA ORDEM CRESCENTE
		for (i=n; i<=n; i--) {
			z = n/i;
			if (n % i == 0) {
				System.out.println(z);
			}
			if (i == 1) {
				break;
			}
		}
	}

}
