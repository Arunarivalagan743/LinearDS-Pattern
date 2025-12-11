package BitPatterns;

import java.util.Scanner;

public class GenerateBinaryNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        while (k-- > 0) {
            int n = in.nextInt();
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                int a = i;
                while (a >0) {
                    sb.append(a%2);
                    a = a/2;
                }

                System.out.println(sb.reverse());
                sb.setLength(0);

            }



        }
    }
}
