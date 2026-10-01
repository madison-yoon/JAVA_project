package GameSetting;

public class GameMain {

    public static void main(String[] args) {

        Player player1 = new Player();
        Player player2 = new Player();

        player1.print();
        player2.print();

        player2.setInfo("player2","1080 * 560", 30, 1);

        player1.print();
        player2.print();
    }
}