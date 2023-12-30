public class User {


    private String userId;
    private String username;
    private String passwordHash;


    //Constructor
    public User(String userId, String username, String passwordHash) {
        this.userId = userId;
        this.username = username;
        this.passwordHash = passwordHash;
    }

    //Default Construct
    public User() {
        this.userId = "";
        this.username = "";
        this.passwordHash = "";
    }

    public User(String username2, String password) {

        this.username = username2;
        this.passwordHash = password;
    }

    //Getters
    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    //Setters
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    //toString
    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                '}';
    }

    //Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (!getUserId().equals(user.getUserId())) return false;
        if (!getUsername().equals(user.getUsername())) return false;
        return getPasswordHash().equals(user.getPasswordHash());
    }

    //Hashcode
    @Override
    public int hashCode() {
        int result = getUserId() != null ? getUserId().hashCode() : 0;
        result = 31 * result + (getUsername() != null ? getUsername().hashCode() : 0);
        result = 31 * result + (getPasswordHash() != null ? getPasswordHash().hashCode() : 0);
        return result;
    }

    public String getPassword() {
        return passwordHash;
    }


}//End of User.java (Do Not Delete This Comment)
