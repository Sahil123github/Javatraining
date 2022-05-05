package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Chhenai {
    private static String i;

    public static void main(String[] args) {
      ArrayList<String> Team = new ArrayList<String>();
       Team.add("Ruturaj");
        Team.add("Ambati raydu");
        Team.add("moeen ali");
        Team.add("ravindra jadeja(c)");
        Team.add("Mahendra singh dhonhi");
        Team.add("Shivam dube");
        Team.add("Dj bravo");
        Team.add("josh hazzelwood");
        Team.add("Mitchell santoner");

        System.out.println("Before sorting the AL: " + Team);

        Collections.sort(Team);


        System.out.println("After sorting  team name :" + Team);

        System.out.println("before reversing team name:" + Team);


        Collections.reverse(Team);

        System.out.println("After reversing  team name :" + Team);






            }
        }



