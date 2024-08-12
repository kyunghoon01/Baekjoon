import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int i;
		for(i=1;i<=9;i++){
			System.out.printf("%d * %d = %d\n",n,i,n*i);
		}
	}
}