package abhilash_learning;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class seive_prime {
	
	public void find_prime(int n){
		int up = (int)(Math.sqrt(n));
		boolean [] iscomposite = new boolean[n-1];
		ArrayList<Integer> prime_number = new ArrayList<Integer>();
		for (int i = 2;i<=up;i++){
			if (!iscomposite[i]){
				for (int j = i*2; j < n-1; j +=i){
					iscomposite[j]=true;
				}
			}
			
		}
		for (int i = 2;i<n-1;i++){
			if(!iscomposite[i]){
				prime_number.add(i);
			}
		}
		System.out.println(prime_number);
	}
    public static void main(String o[])throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Value: ");
        int a = Integer.parseInt(br.readLine());
    	seive_prime ob = new seive_prime();
    	ob.find_prime(a);
    }
}
