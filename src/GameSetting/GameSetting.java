package GameSetting;

public class GameSetting {
    String id;
    String resolution;
    int volume;
    int difficulty;

    // GameSetting 객체를 딱 하나만 생성
    private static GameSetting gameSetting = new GameSetting();

    // 외부에서 new GameSetting()을 못 하게 막음
    private GameSetting() {
        id = "Player1";
        resolution = "1280 * 960";
        volume = 60;
        difficulty = 3;
    }

    // 이미 만들어진 객체를 반환
    public static GameSetting getInstance() {
        return gameSetting;
    }
}