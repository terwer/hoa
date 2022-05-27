package com.terwergreen.s1oa.action.user;

import com.terwergreen.s1oa.bean.User;
import com.terwergreen.s1oa.form.UserForm;
import com.terwergreen.s1oa.service.UserService;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.BaseAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @name: SaveUserAction
 * @author: terwer
 * @date: 2022-05-07 14:13
 **/
public class SaveUserAction extends BaseAction {
    private static final Logger logger = LoggerFactory.getLogger(SaveUserAction.class);
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
        logger.info("保存用户...");

        UserForm userForm = (UserForm) form;
        User user = new User();
        user.setFirstname(userForm.getFirstname());
        user.setLastname(userForm.getLastname());
        user.setAge(userForm.getAge());
        userService.saveUser(user);

        return mapping.findForward(SUCCESS);
    }
}
