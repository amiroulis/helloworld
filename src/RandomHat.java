public class RandomHat {
    public static void main(String[] args) {
        int[] teams = {1, 2, 3, 4, 5, 6, 7, 8};
        int team1 = 0;
        int team2 = 0;
        for (int i = 0; i < 4; i++) {
            team1 = ((int) (Math.random() * 8));
            while (teams[team1] == 0) {
                team1 = ((int)(Math.random() * 8));
            }
            team2 = (int) (Math.random() * 8);
            while (teams[team2] == 0 || team2 == team1) {
                team2 = ((int) (Math.random() * 8));
            }
            System.out.println("Team " + teams[team1] + " will go up against " + teams[team2]);
            teams[team1] = 0;
            teams[team2] = 0;

        }
    }


}
