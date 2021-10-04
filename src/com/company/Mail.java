package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Mail {
Cache cache=new Cache();
Group group=new Group();
    List<User> list=new ArrayList<>();
    public void accountCreation(User user) {
        String email = user.getEmail();
        if (cache.getUserMap().get(email) == null) {
           cache.createUserMap(email,user);
            System.out.println(cache.getUserMap());
            System.out.println("Account is successfully created");
        } else {
            System.out.println("Account already exists");
        }
    }
    public void groupCreation(Group group){
       String  email=group.getGroupEmailId();
       if(cache.getGroupMap().get(email)==null){
          cache.createGroupMap(email,group);
           System.out.println(cache.groupMap);
           System.out.println("Group is Successfully created");
       } else {
           System.out.println("Group Name already exists");
       }
    }


    public void addOrRemove(String decision,String userid){
        for(int i=0;i<Main.userList.size();i++) {
            Map.Entry<String, User> user =Main.userList.get(i);
            User res=user.getValue();
            if(res.getUserId().equals(userid)){
                if(decision.equals("Add")){
                    System.out.println("user"+user);
                    list.add(res);
                    group.setGroupMember(list);
                    System.out.println("User is Successfully added");
                    System.out.println(list);
                }
                else if(decision.equals("Remove")){
                    if(list!=null){
                        list.remove(res);
                        group.setGroupMember(list);
                        System.out.println("User is Successfully removed");
                        System.out.println(list);
                    }
                }
            }
        }
    }


}
