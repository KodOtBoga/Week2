package classes;

public class GameList {
    // Here located all anime and it contains anime list
    private int userId;
    private String gameId;
    private String gameName;
    private String gameGanre;
    private int gameAgeCategory;
    private boolean privacy;

    public GameList(){

    }

    public GameList(int userId, String gameId, String gameName, String gameGanre, int gameAgeCategory, boolean privacy){
        this.userId = userId;
        this.gameId = gameId;
        this.gameName = gameName;
        this.gameGanre = gameGanre;
        this.gameAgeCategory = gameAgeCategory;
        this.privacy = privacy;
    }
    //For raking info about anime which u prefered
    public void getInfo(){
        System.out.println("You have been chosen - " + gameName + " which is created for people in " + gameAgeCategory + " years old. It's janre - " + gameGanre);
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public boolean isPrivacy() {
        return privacy;
    }

    public void setPrivacy(boolean privacy) {
        this.privacy = privacy;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String animeName) {
        this.gameName = animeName;
    }

    public String getGameGanre() {
        return gameGanre;
    }

    public void setGameGanre(String gameGanre) {
        this.gameGanre = gameGanre;
    }

    public int getGameAgeCategory() {
        return gameAgeCategory;
    }

    public void setGameAgeCategory(int gameAgeCategory) {
        this.gameAgeCategory = gameAgeCategory;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }
}
