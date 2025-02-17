package practice_3;

public class GameSettings {
    static int maxPlayers = 10;
    final String gameName;
    int currentPlayers;

    GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    public static void setMaxPlayers(int newMax) {
        maxPlayers = newMax;
    }

    public void addPlayer() {
        if (currentPlayers < maxPlayers) {
            currentPlayers ++;
        }
    }

    public void printGameStatus() {
        System.out.println("Game name: " + gameName + ", Current players: " +
                currentPlayers + ", Max players: " + maxPlayers);
    }

    public static void main(String[] args) {
        GameSettings game1 = new GameSettings("Carcassonne", 2);
        GameSettings game2 = new GameSettings("Ticket to ride", 3);

        game1.printGameStatus();
        game2.printGameStatus();

        setMaxPlayers(5);

        game1.addPlayer();
        game2.addPlayer();

        game1.printGameStatus();
        game2.printGameStatus();
    }


}
