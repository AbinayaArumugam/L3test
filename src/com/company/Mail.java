package com.company;

import java.util.*;

public class Mail {

    public static void accountCreation(User user) {
        String email = user.getEmail();
        if (Main.userMap.get(email) == null) {
            Main.userMap.put(email, user);
            System.out.println("Account is successfully created");
        } else {
            System.out.println("Account already exists");
        }
    }
    public static void groupCreation(Group group){
       String  email=group.getGroupEmailId();
       if(Main.groupMap.get(email)==null){
           Main.groupMap.put(email,group);
           System.out.println("Group is Successfully created");
       } else {
           System.out.println("Group Name already exists");
       }
    }

    public static boolean emailCheck(String email) {
        int i = 0;
        if(email.indexOf('@')!=-1&&Main.userMap.get(email)==null){
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

}
