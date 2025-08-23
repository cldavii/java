package secao05;

import java.util.Locale;
import java.util.Scanner;

public class GameDuration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        byte gameStartTime = scanner.nextByte();
        byte gameEndTime = scanner.nextByte();
        byte maxDuration = 24;
        int gameDuration;
        if (gameStartTime < gameEndTime) {
            gameDuration = gameEndTime - gameStartTime;
        } else {
            gameDuration = (maxDuration - gameStartTime) + gameEndTime;
        }
        System.out.println("O JOGO DUROU " + gameDuration + " HORA(S)");
        scanner.close();
    }
}
