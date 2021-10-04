package com.company;


import java.util.Map;
import java.util.Scanner;

public class Input {
    Scanner in=new Scanner(System.in);
    Cache cache=new Cache();

    public String checkGroupName(String groupName) {
        for (int i = 0; i < Main.groupList.size(); i++) {
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
    public String checkUserId(String userId){
        for(int i=0;i<Main.userList.size();i++) {
            Map.Entry<String, User> user =Main.userList.get(i);
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
    public boolean validityCheck(String email) {
        int i = 0;
        if(email.indexOf('@')!=-1&&cache.getUserMap().get(email)==null){
            if (email.charAt(i) >= 'a' && email.charAt(i) <= 'z' || (email.charAt(i) <= 0 && email.charAt(i) >= 9)) {
                i++;
            } else {
                return false;
            }
            return true;
        }else {
            return false;
        }
    }
    public String emailCheck(String email){
        if (!validityCheck(email)) {
            System.out.println("Invalid email.An valid email should be in Lowercase with one @ symbol");
            System.out.println("Enter valid email Id");
            String mail=in.next();
            emailCheck(mail);
        }
        return email;
    }
    public void close(){
        in.close();
    }
}
