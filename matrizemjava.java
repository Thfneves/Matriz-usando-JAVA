import java.util.Scanner;

public class matrizemjava {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int M, N ;
		
		System.out.print("Quantas linhas vai ter a matriz?");
		M= sc.nextInt();
			
		
		System.out.println("Quantas colunas tera na matriz?");
		N= sc.nextInt();
		int[][] mat = new int [M] [N];
		

for (int i=	0; i <M; i++) {
	for (int j = 0; j< N; j++ ) {
		System.out.print ("Elemento["+i+","+j+"]");
		mat[i][j] = sc.nextInt();
		}	
	}
	System.out.println();
	System.out.println("Matriz digitada");
	for (int i = 0; i < M; i++) {
	for (int j = 0; j < N; j++) {
		System.out.print (mat[i][j]+ ""	);
	}
	System.out.println();

}
sc.close();
	}
}
