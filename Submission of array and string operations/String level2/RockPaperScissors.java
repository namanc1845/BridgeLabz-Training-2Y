import java.util.Scanner;

public class RockPaperScissors {

    public static String computerChoice() {

        int choice = (int)(Math.random() * 3);

        if (choice == 0) {
            return "rock";
        } else if (choice == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    public static String findWinner(String user, String computer) {

        if (user.equals(computer)) {
            return "Draw";
        }

        if ((user.equals("rock") && computer.equals("scissors"))
                || (user.equals("paper") && computer.equals("rock"))
                || (user.equals("scissors") && computer.equals("paper"))) {

            return "User";
        }

        return "Computer";
    }

    public static String[][] getStatistics(int userWins,
                                           int computerWins,
                                           int draws,
                                           int games) {

        String[][] stats = new String[3][3];

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.valueOf((userWins * 100.0) / games);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.valueOf((computerWins * 100.0) / games);

        stats[2][0] = "Draw";
        stats[2][1] = String.valueOf(draws);
        stats[2][2] = String.valueOf((draws * 100.0) / games);

        return stats;
    }

    public static void displayStatistics(String[][] stats) {

        System.out.println("\nPlayer\tWins\tPercentage");

        for (int i = 0; i < stats.length; i++) {

            System.out.println(stats[i][0] + "\t"
                    + stats[i][1] + "\t"
                    + stats[i][2] + "%");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        int userWins = 0;
        int computerWins = 0;
        int draws = 0;

        for (int i = 1; i <= games; i++) {

            System.out.print("\nEnter rock, paper or scissors: ");
            String user = sc.next().toLowerCase();

            String computer = computerChoice();

            String winner = findWinner(user, computer);

            System.out.println("Computer chose: " + computer);
            System.out.println("Winner: " + winner);

            if (winner.equals("User")) {
                userWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            } else {
                draws++;
            }
        }

        String[][] stats =
                getStatistics(userWins, computerWins, draws, games);

        displayStatistics(stats);

        sc.close();
    }
}