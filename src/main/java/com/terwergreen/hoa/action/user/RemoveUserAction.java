package com.terwergreen.hoa.action.user;

import com.opensymphony.xwork2.ActionSupport;
import com.terwergreen.hoa.bean.User;
import com.terwergreen.hoa.service.UserService;

/**
 * 删除用户
 *
 * @author terwer
 */
@SuppressWarnings("serial")
public class RemoveUserAction extends ActionSupport {

    private User user;
    private UserService userService;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String execute() throws Exception {
        userService.deleteUser(user);
        return SUCCESS;
    }
}
