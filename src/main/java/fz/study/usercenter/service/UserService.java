package fz.study.usercenter.service;

import com.baomidou.mybatisplus.extension.service.IService;
import fz.study.usercenter.model.domain.User;
import jakarta.servlet.http.HttpServletRequest;

/**
* @author 10632
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2023-11-28 14:02:22
*/

/**
 * 用户服务
 */
public interface UserService extends IService<User> {

    /**
     * 用户注册
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 校验密码
     * @param planetCode 星球编号
     * @return 新用户id
     */
    long userRegister(String userAccount,String userPassword,String checkPassword,String planetCode);

    /**
     * 用户登录
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @return 返回脱敏后的用户
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);


    /**
     * 用户脱敏
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);

    /**
     * 用户注销
     *
     */
    int userLogout(HttpServletRequest request);

}
