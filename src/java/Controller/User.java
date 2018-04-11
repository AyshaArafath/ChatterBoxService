/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author MSI
 */
public class User {
    ArrayList<Data.User> userList = new ArrayList<>();
    
    //Register User
    public Data.User registerUser (String username , String nickname, char[] password){
        
        Data.User user = new Data.User(username, password, nickname);
        
        return user;
    } 
    
    //find a user with a specific username
    
    private Data.User getUser (String username){
        for(Data.User user : userList){
            if(user.getUsername().equals(username));
            return user;
        }
        return null;
    }
            
    public Data.User login (String username, char[] password){
        Data.User user = getUser(username);
        if(Arrays.equals(password, user.getPassword())){
            return user;
        }
        return null;
    }
    
}
