package com.dhakre.dao;

import com.dhakre.domain.User;

import java.io.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vivek on 13/6/17.
 * @project restapi
 * @package com.dhakre.dao
 */
public class UserDao {

    public List<User> getAllUsers(){

        List<User> userList = null;

        try {
            File f = new File("User.dat");
            if(!f.exists()){
                User user = new User(1,"Vivek","Developer");
                userList = new ArrayList<User>();
                userList.add(user);

                FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(userList);
                oos.close();

            }else{
                InputStream is = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(is);
                userList = (List<User>)ois.readObject();

            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return userList;
    }
}
