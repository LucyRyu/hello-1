package gourmet;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class Gourmet {

    private String title;
    private String mainMenu;
    private int score;

    public Gourmet() {
        System.out.println("생성자 진짜 호출 되나요?");
    }

    public Gourmet(String title, String mainMenu, int score) {
        this.title = title;
        this.mainMenu = mainMenu;
        this.score = score;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getMainMenu() {
        return mainMenu;
    }
    public void setMainMenu(String mainMenu) {
        this.mainMenu = mainMenu;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
}
