package classes;
public class User {
    private int id;
    private String username;
    private String password;
    private boolean isAdmin;

    public User(String username, String password, int id, boolean isAdmin) {
        this.username = username;
        this.password = password;
        this.id = id;
        this.isAdmin = isAdmin;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
}
