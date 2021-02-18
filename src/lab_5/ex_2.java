package lab_5;

public class ex_2 {
    public static void main(String[] args) {
        /*
        5.2 Write a program to give a simple example for abstract class.
         */

        EndUser endUser = new EndUser("testUser", "123");
        endUser.Login();
        endUser.createPost();
        endUser.Logout();

        Admin admin = new Admin("superAdmin", "123");
        admin.Login();
        admin.setAuditedEntries(5);
        admin.getAuditedEntries();
        admin.Logout();
    }
}
