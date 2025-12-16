package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class FindAllIndeXLinearSearch {

        public static void main(String[] args) {
            int a[] ={1,2,3,4,5,6,6,53,53,23};
            int k  = 53;
            int i  = a.length - 1;
            ArrayList<Integer> al = new ArrayList<>();
            linear(a,k,i,al);
            Collections.reverse(al);
            System.out.println(al);

//return arraylist
            ArrayList<Integer> al2 =  linear(a,k,i);
            linear(a,k,i,al2);
            Collections.reverse(al2);
            System.out.println(al2);



        }
        public static ArrayList<Integer> linear(int a[], int k, int i,ArrayList<Integer> al) {
            if(i < 0){
                return al;
            }
            if(a[i] == k)
            {
                al.add(i);

            }
            return linear(a,k,i-1,al);
        }

    public static ArrayList<Integer> linear(int a[], int k, int i) {
        ArrayList<Integer> al2 = new ArrayList<>();  // every functaiol create new arraylist but not not updated in one  arraylist is update it point on the diifrent refrence
        if(i < 0){
            return al2;
        }
        if(a[i] == k)
        {
            al2.add(i);

        }

        ArrayList<Integer> below = linear(a, k, i - 1); // evry finshing funstion call terminates add that arraylist on the functionl new al .that arraylit is availbale in y=that arrylist only
        al2.addAll(below);
        return al2;


    }
    }


