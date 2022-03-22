//Defining Super Simple Bean for User

package Users;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDAOService {

    private static List<Users> users = new ArrayList<>();
    private static int userCount = 3;

    static {
        users.add(new Users(1, "Adam", new Date()));
        users.add(new Users(2, "Eve", new Date()));
        users.add(new Users(3, "Jacob", new Date()));
    }

    public List<Users> findAll() {
        return users;
    }

    public Users save(Users user) {
        if (user.getId() == null) {
            user.setId(++userCount);
        }
        users.add(user);
        return user;
    }

    public Users findOne(int id) {
        for (Users user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

}
