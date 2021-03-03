package lab_5;

public class Admin extends User{

    private int auditedEntries;

    public Admin(String username, String password){
        super(username, password);
    }

    @Override
    public void Login() {
        System.out.println("Has logged into the admin panel");
    }

    public int getAuditedEntries() {
        System.out.println(this.getUsername() + " has audited " + this.auditedEntries + " entries");
        return auditedEntries;
    }

    public void setAuditedEntries(int auditedEntries) {
        this.auditedEntries = auditedEntries;
    }


    @Override
    public void Logout() {
        System.out.println(this.getUsername() + " has logged out from the admin panel");

    }
}
