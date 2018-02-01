package com.lzz.logic;

import com.lzz.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lzz on 2018/1/21.
 */
@Component
public class MainLogic {
    public List<User> userList() {
        List<User> list = new ArrayList<>();
        User user = new User("ggg", "lzz", "aa" ,"kkk");
        User user1 = new User("ggg1", "lzz1", "aa1" ,"kkk1");
        list.add( user );
        list.add( user1 );
        return list;
    }
}
