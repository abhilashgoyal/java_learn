package abhilash_learning;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class spiral_array_abhi {
    int arr[][];
    int i = 0,j = -1,max_len,val = 1;

    public void build_spriral(int n) {
        max_len = n;
        arr = new int[n][n];
         
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                arr[i][j] = 0;
        }

        while (val <= n * n) {
            this.turn_right();
            this.turn_down();
            this.turn_left();
            this.turn_up();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "      ");
            }
            System.out.println("\n");
        }

    }


    public void turn_right() {
        while ((i == 0 && j < max_len - 1) || (i > 0 && arr[i][j + 1] == 0)) {
            arr[i][++j] = val++;
        }
    }


    public void turn_down() {
        while ((i + 1) < max_len && arr[i + 1][j] == 0) {
            arr[++i][j] = val++;
        }
    }

    public void turn_left() {
        while ((j - 1) >= 0 && arr[i][j - 1] == 0) {
            arr[i][--j] = val++;
        }
    }

    public void turn_up() {
        while ((i - 1) > 0 && arr[i - 1][j] == 0) {
            arr[--i][j] = val++;
        }

    }

    public static void main(String o[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Value: ");
        int a = Integer.parseInt(br.readLine());
        spiral_array_abhi ob = new spiral_array_abhi();
        ob.build_spriral(a);
    }
}
