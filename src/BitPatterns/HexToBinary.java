package BitPatterns;

import java.util.Scanner;

public class HexToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String h = sc.nextLine();
        int b = Integer.parseInt(h, 16);
StringBuilder sb = new StringBuilder();
     while(b > 0)
     {
      sb.append(b%2);
            b = b/2;
     }
     System.out.println(sb.reverse());
    }
}
