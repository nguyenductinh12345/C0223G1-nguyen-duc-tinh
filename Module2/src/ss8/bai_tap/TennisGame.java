package ss8.bai_tap;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        if (player1Score == player2Score) {
            return getTieScore(player1Score);
        } else if (player1Score >= 4 || player2Score >= 4) {
            return getWinOrAdvantageScore(player1Score, player2Score);
        } else {
            return getRunningScore(player1Score, player2Score);
        }
    }

    private static String getTieScore(int score) {
        String[] scoreNames = new String[]{"Love-All", "Fifteen-All", "Thirty-All", "Forty-All", "Deuce"};
        if (score < 4) {
            return scoreNames[score];
        } else {
            return scoreNames[4];
        }
    }

    private static String getWinOrAdvantageScore(int player1Score, int player2Score) {
        int scoreDifference = player1Score - player2Score;
        if (scoreDifference == 1) {
            return "Advantage player1";
        } else if (scoreDifference == -1) {
            return "Advantage player2";
        } else if (scoreDifference >= 2) {
            return "Win for player1";
        } else {
            return "Win for player2";
        }
    }

    private static String getRunningScore(int player1Score, int player2Score) {
        String[] scoreNames = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
        return scoreNames[player1Score] + "-" + scoreNames[player2Score];
    }
}
