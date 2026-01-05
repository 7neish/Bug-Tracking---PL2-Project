import java.util.List;

public interface user_service_blueprint {

    User login(String username, String password);

    User getUserByUsername(String username);

    void addUser(User user);

    void delUser(User user);

    List<User> getAllUsers();

    User getUserById(String userId);

    List<String> getAllDevelopersName();

    List<String> getAllTestersName();

    void refreshUser();

    int checkUser(String username, String password);

    boolean IsNotEmptyuser(String userId, String fullName, String email);

    int CheckEmail_andFullname(String fullname, String email);

}