package com.company;

import java.util.HashMap;
import java.util.Map;

public class Cache {
    Map<String,User> userMap=new HashMap<>();
    Map<String,Group> groupMap=new HashMap<>();
    public void createUserMap(String email,User user){
     if(user!=null){
         userMap.put(email,user);
     }
    }
    public Map<String,User> getUserMap(){
        return userMap;
    }
    public void createGroupMap(String email,Group group){
        if(group!=null){
            groupMap.put(email,group);
        }
    }
    public Map<String,Group> getGroupMap(){
        return groupMap;
    }

}
