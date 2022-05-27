package com.terwergreen.s1oa.form;

import com.terwergreen.s1oa.bean.User;
import org.apache.struts.action.ActionForm;

import java.util.ArrayList;
import java.util.List;

/**
 * @name: UserListForm
 * @author: terwer
 * @date: 2022-05-07 16:18
 **/
public class UserListForm extends ActionForm {
    private List<User> userList = new ArrayList<User>();

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
