package com.dhakre.service;

import com.dhakre.dao.UserDao;
import com.dhakre.domain.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @author Vivek on 13/6/17.
 * @project restapi
 * @package com.dhakre.service
 */

@Path("/userservice")

public class UserService {

    UserDao userDao = new UserDao();

    @GET
    @Path("/users")
    @Produces(MediaType.APPLICATION_XML)
    public List<User> getUsers(){
        return userDao.getAllUsers();
    }
}
