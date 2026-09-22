public class StudentScorecard {

    // Generate random 2-digit marks for Physics, Chemistry and Maths
    public static int[][] generateScores(int numberOfStudents) {

        int[][] scores = new int[numberOfStudents][3];

        for (int i = 0; i < numberOfStudents; i++) {

            for (int j = 0; j < 3; j++) {
                scores[i][j] = 10 + (int) (Math.random() * 90);
            }
        }

        return scores;
    }


    // Calculate total, average and percentage
    public static double[][] calculateResult(int[][] scores) {

        double[][] result = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {

            double total = scores[i][0] + scores[i][1] + scores[i][2];

            double average = total / 3.0;

            double percentage = average;

            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }

        return result;
    }


    // Find grade according to percentage
    public static String[] calculateGrade(double[][] result) {

        String[] grades = new String[result.length];

        for (int i = 0; i < result.length; i++) {

            double percentage = result[i][2];

            if (percentage >= 80) {
                grades[i] = "A";
            }
            else if (percentage >= 70) {
                grades[i] = "B";
            }
            else if (percentage >= 60) {
                grades[i] = "C";
            }
            else if (percentage >= 50) {
                grades[i] = "D";
            }
            else if (percentage >= 40) {
                grades[i] = "E";
            }
            else {
                grades[i] = "R";
            }
        }

        return grades;
    }


    // Display scorecard
    public static void displayScorecard(int[][] scores,
                                        double[][] result,
                                        String[] grades) {

        System.out.println(
                "Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");

        for (int i = 0; i < scores.length; i++) {

            System.out.println(
                    (i + 1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t\t" +
                    scores[i][2] + "\t" +
                    result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2] + "%\t\t" +
                    grades[i]
            );
        }
    }


    public static void main(String[] args) {

        int numberOfStudents = 10;

        int[][] scores = generateScores(numberOfStudents);

        double[][] result = calculateResult(scores);

        String[] grades = calculateGrade(result);

        displayScorecard(scores, result, grades);
    }
}