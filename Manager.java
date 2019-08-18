public class Manager {
    int Id;
    String UserName;
    String Password;

    public int getId() {
        return Id;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Manager(int id, String userName, String password) {
        Id = id;
        UserName = userName;
        Password = password;
    }
}
