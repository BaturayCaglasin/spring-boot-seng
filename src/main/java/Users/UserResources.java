package Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserResources {

    @Autowired //UserDAOService class'ındaki user'ları almak için o bean class'ı ile bağladık, autowired yaparak.
    private UserDAOService userDAOService;


    //1.method: Retrieve all users -> GET/users
    @RequestMapping(method = RequestMethod.GET, path = "/users")
    public List<Users> retrieveAllUsers() {
        return userDAOService.findAll();
    }

    //2.method: Retrieve one specific user from id -> GET/users/{id}
    @RequestMapping(method = RequestMethod.GET, path = "/users/{id}")
    public Users retrieveUser(@PathVariable int id) {
        return userDAOService.findOne(id);

    }
}
