package com.company;
import java.util.*;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList i=new ArrayList<test>();

        i.add("A");
         i.add("B");
        System.out.println(i);

        HashMap<Integer,String> m =new HashMap<Integer,String>();
        m.put(101,"sahil");

        for(Map.Entry map : m.entrySet()){
            System.out.println(map.getKey()+" "+map.getValue());
        }

//        String s=new String("sahil");
//        System.out.println(s);

      //  System.out.println(i);


    }
}
