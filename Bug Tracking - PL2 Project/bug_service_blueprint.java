import java.util.List;

public interface bug_service_blueprint {
    void addBug(Bug bug);

    List<Bug> getAllBugs();

    List<Bug> getBugsByTester(String tastername);

    List<Bug> getBugsByDeveloper(String developername);

    Bug findBugByName(String bugname);



    Bug GetBugByID(String ID);

    String bugReport();

    void refreshBugs();

    boolean IsNotEmptyBug(String BugID, String bugName, String projectName);

}