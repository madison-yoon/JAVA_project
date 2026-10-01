package GameSetting;

public class Player {

    // GameSetting의 싱글톤 객체를 가져옴
    GameSetting gameSetting = GameSetting.getInstance();

    void setInfo(String id,String resolution, int volume, int difficulty) {
        gameSetting.id = id;
        gameSetting.resolution = resolution;
        gameSetting.volume = volume;
        gameSetting.difficulty = difficulty;
    }

    public void print() {
        System.out.println("ID : " + gameSetting.id);
        System.out.println("해상도 : " + gameSetting.resolution);
        System.out.println("볼륨 : " + gameSetting.volume);
        System.out.println("난이도 : " + gameSetting.difficulty);
    }
}