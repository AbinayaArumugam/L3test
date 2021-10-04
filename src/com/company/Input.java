package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Input {
   static Group group=new Group();
  static   Scanner in=new Scanner(System.in);

    public static String checkGroupName(String groupName) {
        for (int i = 0; i < Main.list.size(); i++) {
            Map.Entry<String, Group> groupEntry =Main.groupList.get(i);
            Group res = groupEntry.getValue();
            if (!res.getGroupName().equals(groupName)) {
                System.out.println("No such group exists. Enter valid Group");
                System.out.println("Enter Valid group name");
                String name = in.next();
                checkGroupName(name);
            }
        }
            return groupName;

    }
    public static String checkUserId(String userId){
        for(int i=0;i<Main.userList.size();i++) {
            Map.Entry<String, User> user =Main. userList.get(i);
            User res=user.getValue();
            if (!res.getUserId().equals(userId)) {
                System.out.println("No such user found");
                System.out.println("Enter Valid user name");
                String name = in.next();
                checkUserId(name);
            }
        }
       return userId;
    }
    public static void addOrRemove(String decision,String userid){
        for(int i=0;i<Main.userList.size();i++) {
            Map.Entry<String, User> user =Main. userList.get(i);
            User res=user.getValue();
            if(res.getUserId().equals(userid)){
                    if(decision.equals("Add")){
                       System.out.println("user"+user);
                       Main.list.add(res);
                       group.setGroupMember(Main.list);
                        System.out.println("User is Successfully added");
                        System.out.println(Main.list);
                     }
                      else if(decision.equals("Remove")){
                          if(Main.list!=null&&res!=null){
                            Main.list.remove(res);
                            group.setGroupMember(Main.list);
                            System.out.println("User is Successfully removed");
                            System.out.println(Main.list);
                          }
                      }
            }
        }
    }
    public static String emailCheck(String email){
        if (!Mail.emailCheck(email)) {
            System.out.println("Invalid email.An valid email should be in Lowercase with one @ symbol");
            System.out.println("Enter valid email Id");
            String mail=in.next();
            emailCheck(mail);
        }
        return email;
    }
}
