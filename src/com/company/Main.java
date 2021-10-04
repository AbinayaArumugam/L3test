package com.company;

import java.util.*;

public class Main {
    static Map<String, User> userMap = new HashMap<>();
    static Map<String,Group> groupMap=new HashMap<>();
    static List<Map.Entry<String, Group>> groupList = new ArrayList<>(Main.groupMap.entrySet());
    static  List<Map.Entry<String,User>> userList =new ArrayList<>(Main.userMap.entrySet());
 static List<User> list=new ArrayList<>();
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                System.out.println("1.Create User");
                System.out.println("2.Create Group");
                System.out.println("3.Group Assignment");
                System.out.println("4.Compose mail");
                System.out.println("5.Inbox");
                System.out.println("6.Send mail");
                System.out.println("7.Delete mail");
                System.out.println("8.Recall");
                System.out.println("9.Share Inbox");
                System.out.println("10.Exit");
                System.out.println("Enter your choice");
                int choice = in.nextInt();
                Group group=new Group();
                User user = new User();
                switch (choice) {
                    case 1:
                            System.out.println("Enter the User ID");
                            in.nextLine();
                           String userId = in.nextLine();
                            System.out.println("Enter the email");
                            String email = Input.emailCheck(in.nextLine());
                            System.out.println("Enter Password");
                            String password = in.nextLine();
                            user.setUserId(userId);
                            user.setEmail(email);
                            user.setPassword(password);
                            Mail.accountCreation(user);
                            System.out.println(userMap);
                        break;
                    case 2:
                        System.out.println("Enter the Group Name");
                        in.nextLine();
                        String name=in.nextLine();
                        System.out.println("Enter the Email id");
                        String groupEmail=Input.emailCheck(in.nextLine());
                        System.out.println("Enter the password");
                        String groupPassword=in.nextLine();
                        System.out.println("Enter the Description");
                        String description=in.nextLine();
                        group.setGroupName(name);
                        group.setGroupEmailId(groupEmail);
                        group.setPassword(groupPassword);
                        group.setDescription(description);
                        Mail.groupCreation(group);
                        System.out.println(groupMap);
                        break;
                    case 3:

                        System.out.println("Enter Group name");
                        String groupName=Input.checkGroupName(in.next());
                        System.out.println("Enter User Id");
                        String userid=Input.checkUserId(in.next());
                        System.out.println("Add/Remove");
                        String decision=in.next();
                        Input.addOrRemove(decision,userid);
                        break;

                    case 10:
                        return;
                }
            }
    }catch (InputMismatchException e){
            System.out.println("Invalid Input");
        }
    }


}
