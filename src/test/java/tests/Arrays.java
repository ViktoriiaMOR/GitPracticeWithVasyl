package tests;

import java.util.HashSet;
import java.util.Set;

public class Arrays {

    public static void main(String[] args) {
        char[] arr1={'c','b','c'};
        char[] arr2={'b','c','d'};
        Set<Character> noDupl = new HashSet();

        for(int i=0; i<arr1.length; i++){
            if(i==arr1.length) {break;}
            for(int k=0; i<arr2.length; k++){

                if(k==arr2.length) {break;}
                if(arr1[i]==arr2[k]){
                    noDupl.add(arr2[k]);

                }

            }

        }

        System.out.println(noDupl);



    }
}
