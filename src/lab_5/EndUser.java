package lab_5;

public class EndUser extends User{
    public EndUser(String username, String password) {
        super(username, password);
    }

    @Override
    public void Login() {
        System.out.println(this.getUsername() + " has logged into the mobile app with 2FA");
    }

    @Override
    public void Logout() {
        System.out.println(this.getUsername() + " has logged out from the mobile app");
    }

    public void createPost(){
        System.out.println(this.getUsername() + " created a new post");
    }
}
