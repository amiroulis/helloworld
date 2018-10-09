import java.util.Scanner;

public class RandomHatV2 {
    public static void main(String[] args) {
        amountteams();


    }
    public static void amountteams() {
        Scanner input = new Scanner(System.in);
        int nteams = 0;
        int counter = 1;
        do {
            if (counter > 1) {
                System.out.println("I'm sorry, that is not a valid number, please enter an even number.");
            }
            System.out.print("How many teams would you like? ");
            nteams = input.nextInt();
            counter++;
        } while(nteams % 2 != 0);
       int[] teams = fillarray(nteams);
       printteams(nteams, teams);



    }
    public static int[] fillarray(int nteams) {
        int[] teams = new int [nteams];
        for (int j = 1; j <= nteams; j++) {
            teams[j - 1] = j;


        }
        return teams;
    }
    public static void printteams(int nteams, int[] teams) {
        int team1 = 0;
        int team2 = 0;
        for (int i = 0; i < teams.length / 2; i++) {
            team1 = ((int) (Math.random() * teams.length));
            while (teams[team1] == 0) {
                team1 = ((int) (Math.random() * teams.length));
            }
            team2 = (int) (Math.random() * teams.length);
            while (teams[team2] == 0 || team2 == team1) {
                team2 = ((int) (Math.random() * teams.length));
            }
            System.out.println("Team " + teams[team1] + " will go up against " + teams[team2]);
            teams[team1] = 0;
            teams[team2] = 0;

        }

    }



}
