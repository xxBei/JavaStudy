package com.zzw.finalDemo;

import java.util.ArrayList;
import java.util.List;

public class UserDB {
    private static List<User> users = new ArrayList<User>();

    static {
        users.add(new User("张三","110"));
        users.add(new User("李四","120"));
        users.add(new User("王五","119"));
        users.add(new User("zzw","911"));
    }

    public static List<User> getUsers() {
        return users;
    }
}
