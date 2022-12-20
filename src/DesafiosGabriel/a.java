package DesafiosGabriel;

import java.util.Scanner;

public class a {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int time = sc.nextInt();
        long thisNum = 0L;
        long pastNum = 0L;
        long pastPastNum;
        long futureNum = 1L;

        for (int reps = 0; reps < time; reps++) {

            pastPastNum = pastNum;
            pastNum = thisNum;
            thisNum = futureNum;
            futureNum = thisNum + pastNum;



            System.out.print(thisNum + ", ");



        }

    }
}
