package com.hillel.lessons.lesson5;

import java.util.Scanner;

public class LateHomework6 {
    public static void main(String[] args) {


        System.out.println("CS BestTeam");
        System.out.println("Please, enter the points for Player1:");

        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {


            int ValueBestTeam1 = scanner.nextInt();
            System.out.println();

            System.out.println("Please, enter the points for Player2:");
            int ValueBestTeam2 = scanner.nextInt();
            System.out.println();

            System.out.println("Please, enter the points for Player3:");
            int ValueBestTeam3 = scanner.nextInt();
            System.out.println();

            System.out.println("Please, enter the points for Player4:");
            int ValueBestTeam4 = scanner.nextInt();
            System.out.println();

            System.out.println("Please, enter the points for Player5:");
            int ValueBestTeam5 = scanner.nextInt();


            System.out.print("CS Worst Team");
            System.out.println();
            System.out.println("Please, enter the points for WorstPlayer1:");



            int ValueWorstTeam1 = scanner.nextInt();
            System.out.println();

            System.out.println("Please, enter the points for Player2:");
            int ValueWorstTeam2 = scanner.nextInt();
            System.out.println();

            System.out.println("Please, enter the points for Player3:");
            int ValueWorstTeam3 = scanner.nextInt();
            System.out.println();

            System.out.println("Please, enter the points for Player4:");
            int ValueWorstTeam4 = scanner.nextInt();
            System.out.println();

            System.out.println("Please, enter the points for Player5:");
            int ValueWorstTeam5 = scanner.nextInt();


            System.out.println("Player 1: " + ValueBestTeam1);
            System.out.println("Player 2: " + ValueBestTeam2);
            System.out.println("Player 3: " + ValueBestTeam3);
            System.out.println("Player 4: " + ValueBestTeam4);
            System.out.println("Player 5: " + ValueBestTeam5);
            int BestTotal = ValueBestTeam1 + ValueBestTeam2 + ValueBestTeam3 + ValueBestTeam4 + ValueBestTeam5;
            int BestTeamAvarage = BestTotal/5;
            System.out.println("Average points for the BestTeam is: " + BestTeamAvarage);


            System.out.println("Player 1: " + ValueWorstTeam1);
            System.out.println("Player 2: " + ValueWorstTeam2);
            System.out.println("Player 3: " + ValueWorstTeam3);
            System.out.println("Player 4: " + ValueWorstTeam4);
            System.out.println("Player 5: " + ValueWorstTeam5);
            int WorstTotal = ValueWorstTeam1 + ValueWorstTeam2 + ValueWorstTeam3 + ValueWorstTeam4 + ValueWorstTeam5;
            int WorstTeamAvarage = WorstTotal / 5;
            System.out.println("Averge points for the WorsTeam is: " + WorstTeamAvarage);


            if (WorstTeamAvarage < BestTeamAvarage) {
                System.out.println("Winner is BestTeam");
            } else {
                System.out.println("Winner is the WorstTeam");
            }


        } else {
            System.out.println("Nope, try again! And, yes, restart the program, please, I'm trying to eat elephant by pieces for now");
            System.exit(0);

        }


    }
}
