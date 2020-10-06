package classes;

public class Game extends GameList {
    public Game(){
        super();
    }

    public Game(int userId, String animeId, String animeName, String animeGenre, int animeAgeCategory, boolean privacy) {
        super(userId, animeId, animeName, animeGenre, animeAgeCategory, privacy);
    }

    @Override
    public int getUserId() {
        return super.getUserId();
    }

    @Override
    public void setUserId(int userId) {
        super.setUserId(userId);
    }

    @Override
    public boolean isPrivacy() {
        return super.isPrivacy();
    }

    @Override
    public void setPrivacy(boolean privacy) {
        super.setPrivacy(privacy);
    }

    @Override
    public void getInfo() {
        super.getInfo();
    }

    @Override
    public String getGameName() {
        return super.getGameName();
    }

    @Override
    public String getGameId() {
        return super.getGameId();
    }

    @Override
    public void setGameGanre(String gameGanre) {
        super.setGameGanre(gameGanre);
    }

    @Override
    public void setGameName(String animeName) {
        super.setGameName(animeName);
    }

    @Override
    public String getGameGanre() {
        return super.getGameGanre();
    }

    @Override
    public void setGameId(String gameId) {
        super.setGameId(gameId);
    }
}
