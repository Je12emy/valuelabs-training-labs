package lab_5;

public abstract class ex_3 {

    /*
     * 5.3 Write a program suppose, it is required to build a project consisting of
     * a number of classes, possibly using a large number of programmers. It is
     * necessary to make sure that every class from which all other classes in the
     * project will be inherited. Since any new classes in the project must inherit
     * from the base class, programmers are not free to create a different
     * interface. Therefore, it can be guaranteed that all the classes in the
     * project
     */

    // DB Operations
    protected abstract void openDBConnection();

    protected abstract void insertDB();

    protected abstract void queryDB();

    protected abstract void updateDB();

    protected abstract void deleteDB();

    // REST Handlers
    protected abstract void endPointHandler();

    // Domain Service
    protected abstract void endpointService();

    // Utilities
    protected abstract void validate();

    protected abstract void encrypt();
}
