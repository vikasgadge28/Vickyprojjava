package Codechef;

import java.util.Scanner;

public class The_Lead_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int lead=0 ,player1=0, player2=0,winner=0;
        while (t --> 0 ){
             player1 = player1+ sc.nextInt();
             player2 = player2+ sc.nextInt();
            if(player1>player2 && (player1-player2)>lead){
                lead = player1-player2;
            winner = 1;}
            else if(player2>player1 && (player2-player1)>lead){
                lead =player2-player1;
                winner = 2;
            }

        }
        System.out.println(winner+ " "+ lead);
    }
}
