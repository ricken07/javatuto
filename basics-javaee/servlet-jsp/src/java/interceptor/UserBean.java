/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interceptor;

import cg.yekolab.model.User;
import java.io.Serializable;
import java.util.HashMap;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Orion WAMBERT
 */
@ApplicationScoped
public class UserBean implements Serializable{

    private HashMap<Integer, User> maps;
   
    public UserBean() {
    }
    
    @PostConstruct
    public void init(){
        maps = new HashMap<>();
    }
    
    public void addUser(User user){
        maps.put(user.getId(), user);
    }
    
    public void deleteUser(User user){
        maps.remove(user.getId());
    }
    
    public HashMap<Integer, User>  allUsers(){
        return maps;
    }
}
