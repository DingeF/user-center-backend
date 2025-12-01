package com.yifan.usercenter.constant;

import java.util.Arrays;
import java.util.List;

/**
 * 用户常量
 *
 * @author yifan
 */
public interface UserConstant {
    String USER_LOGIN_STATUS = "userLoginStatus"; // 用户登录状态键：Key

    List<String> ALLOWED_SORT_FIELDS = Arrays.asList("id", "createTime"); // 允许排序的字段

    int USER_DEFAULT_ROLE = 0; // 默认角色：普通用户
    int USER_ADMIN_ROLE = 1; // 管理员角色

}
