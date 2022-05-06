package com.terwergreen.hoa.action.user;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.terwergreen.hoa.bean.User;
import com.terwergreen.hoa.service.UserService;

import java.util.List;
import java.util.Map;

/**
 * 展示用户信息
 *
 * @name: ListUserAction
 * @author: terwer
 * @date: 2022-05-07 01:05
 **/
public class ListUserAction extends ActionSupport {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String execute() throws Exception {
        ActionContext context = ActionContext.getContext();
        Map request = (Map) context.get("request");

        List<User> userList = userService.findAll();
        request.put("userList", userList);

        return SUCCESS;
    }
}
