package com.onlineApplyCourses;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AuthenticationService {
    private List<User> users;
    public AuthenticationService()
    {
        this.users=new ArrayList<>();
    }

    public List<User> getUsers() {
        return users;
    }
    public boolean registerUser(String user_name,String password)
    {
        try{
            for(User user: users)
            {
                if(user.getUser_name().equals(user_name) && Objects.equals(user.getPassword(), password))
                {
                    throw new UserAlreadyExistsException("User already exists");
                }
            }
            users.add(new User(user_name,password));
            return true;
        } catch (UserAlreadyExistsException e)
        {
            System.out.println(e.getMessage());
            return false;
        }

    }
    public User loginUser(String user_name,String password)
    {
       try{
           for(User user: users)
           {
               if(user.getUser_name().equals(user_name) && user.getPassword().equals(password))
               {
                   return user;
               }
           }
       } catch (Exception e)
       {
           System.out.println(e.getMessage());
       }
        return null;
    }
}
class UserAlreadyExistsException extends Exception{
    UserAlreadyExistsException(String msg){
        super(msg);
    }
}
