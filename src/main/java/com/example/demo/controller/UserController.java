package com.example.demo.controller;

import com.example.demo.common.ResultObj;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    IUserService userService;
    /**
     * 登录方法
     * @param
     * @return
     */
    @RequestMapping("f_login")
    public ResultObj f_Login(@RequestBody HashMap data) {
        String a = (String)data.get("account");
        String pwd = (String)data.get("password");
        User user = new User();
        user.setAccount(a);
        user.setPassword(pwd);

        User u = new User();
        try {
            u = userService.login(user);
            System.out.println(u);


            if (u != null) {

                if( u.getPlayer_state().equals(0)){
                    //成功
                    return ResultObj.LOGIN_SUCCESS;
                }else {

                    //冻结
                    return ResultObj.LOGIN_ERROR_CODE;
                }


            } else {

                //错误密码
                return ResultObj.LOGIN_ERROR_PASS;
            }

        } catch (Exception e) {
            e.printStackTrace();
            //网络错误
            return ResultObj.NETWORK_ERROR;
        }

    }

}
