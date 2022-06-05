package com.terwergreen.hoa.action.user;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionSupport;
import com.terwergreen.hoa.bean.User;
import com.terwergreen.hoa.service.UserService;

/**
 * 用户Action
 *
 * @name: SaveUserAction
 * @author: terwer
 * @date: 2022-05-06 21:05
 **/
public class SaveUserAction extends ActionSupport {
	private static final Logger logger = LoggerFactory.getLogger(SaveUserAction.class);

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

//    @Override
//    public void validate() {
//        if (StringUtils.isEmpty(user.getFirstname())) {
//            this.addFieldError("user.firstname", "姓名不能为空");
//        }
//        if (StringUtils.isEmpty(user.getLastname())) {
//            this.addFieldError("user.lastname", "昵称不能为空");
//        }
//        if (null == user.getAge()) {
//            this.addFieldError("user.age", "年龄不能为空");
//        }
//
//        if (user.getFirstname().length() > 150) {
//            this.addFieldError("user.firstname", "姓名不能超过150字符");
//        }
//        if (user.getLastname().length() > 150) {
//            this.addFieldError("user.lastname", "昵称不能超过150字符");
//        }
//    }

	@SuppressWarnings("rawtypes")
	@Override
	public void validate() {
		Map map = this.getFieldErrors();
		Set set = map.keySet();
		for (Iterator iter = set.iterator(); iter.hasNext();) {
			logger.info(map.get(iter.next()).toString());
		}
	}

	@Override
	public String execute() {
		try {
			logger.info("开始保存用户");
			userService.saveUser(user);
		} catch (Exception e) {
			logger.error("保存用户出错：", e);
		}

		return SUCCESS;
	}
}
