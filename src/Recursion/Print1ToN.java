package Recursion;

public class Print1ToN {

        public static void main(String[] args) {
            print(4,4);
        }
        public static void print(int i,int n) {
            if(i < 1)
            {
                return;
            }

            print(i - 1,n );
            System.out.println(i);
        }
    }

