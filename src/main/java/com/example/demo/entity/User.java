package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;


import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
@Data
@TableName("t_user")
public class User implements Serializable {
    private String player_id;
    //玩家索引号，类似于qq号，系统唯一
    private Integer player_index;
    private String player_name;
    private String account;
    private String password;
    // 性别 1=男；2=女
    private Integer player_sex ;
    private String phone_number ;
    //注册时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date registime;
    //最后登录时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date last_login_time;
    //余额
    private Integer balance ;
    //VIP等级；0=普通用户
    private Integer vip_level ;
    //微信登录标识
    private String wx_open_id ;
    private String wx_union_id ;
    //头像地址
    private String headimgurl ;
    //真实姓名
    private String identify_name ;
    //身份证
    private String identify_card ;
    //位置信息
    private String location ;
    // 用户状态：0=正常；1=封号
    private Integer player_state ;
    //省
    private String province ;
    //市
    private String city ;
    private Integer role_type ;



}
