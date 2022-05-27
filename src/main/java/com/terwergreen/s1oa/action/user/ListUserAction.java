package com.terwergreen.s1oa.action.user;

import com.terwergreen.s1oa.bean.User;
import com.terwergreen.s1oa.form.UserListForm;
import com.terwergreen.s1oa.service.UserService;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.BaseAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @name: ListUserAction
 * @author: terwer
 * @date: 2022-05-07 14:17
 **/
public class ListUserAction extends BaseAction {
    private final static String SUCCESS = "success";
    private final static String FAILURE = "failure";

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<User> userList = userService.findAll();

        UserListForm userListForm = (UserListForm) form;
        userListForm.setUserList(userList);

        return mapping.findForward(SUCCESS);
    }
}
