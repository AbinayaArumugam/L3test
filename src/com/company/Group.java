package com.company;

import java.util.List;

public class Group {
    private String groupName;
    private String groupEmailId;
    private String password;
    private String description;
    private List<User> groupMember;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupEmailId() {
        return groupEmailId;
    }

    public void setGroupEmailId(String groupEmailId) {
        this.groupEmailId = groupEmailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<User> getGroupMember() {
        return groupMember;
    }

    public void setGroupMember(List<User> groupMember) {
        this.groupMember = groupMember;
    }
    public String toString(){
        return groupName+"  "+groupEmailId+"  "+password+"  "+description;
    }
}
