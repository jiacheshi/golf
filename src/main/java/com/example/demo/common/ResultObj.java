package com.example.demo.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: 落亦-
 * @Date: 2019/11/21 21:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultObj {

    private Integer result;
    private String err;

    public static final ResultObj LOGIN_SUCCESS=new ResultObj(1,"登陆成功");
    public static final ResultObj LOGIN_ERROR_PASS=new ResultObj(2,"用户名或密码错误");
    public static final ResultObj LOGIN_ERROR_CODE=new ResultObj(0,"账号已经被冻结");
    public static final ResultObj NETWORK_ERROR=new ResultObj(3,"网络异常");
//    public static final ResultObj ADD_SUCCESS = new ResultObj(Constast.OK,"添加成功");
//    public static final ResultObj ADD_ERROR = new ResultObj(Constast.ERROR,"添加失败");
//
//    public static final ResultObj DELETE_SUCCESS = new ResultObj(Constast.OK,"删除成功");
//    public static final ResultObj DELETE_ERROR = new ResultObj(Constast.ERROR,"删除失败");
//
//    public static final ResultObj UPDATE_SUCCESS = new ResultObj(Constast.OK,"修改成功");
//    public static final ResultObj UPDATE_ERROR = new ResultObj(Constast.ERROR,"修改失败");
//
//    public static final ResultObj RESET_SUCCESS = new ResultObj(Constast.OK,"重置成功");
//    public static final ResultObj RESET_ERROR = new ResultObj(Constast.ERROR,"重置失败");
//
//    public static final ResultObj DISPATCH_SUCCESS = new ResultObj(Constast.OK,"分配成功");
//    public static final ResultObj DISPATCH_ERROR = new ResultObj(Constast.ERROR,"分配失败");
//
//    public static final ResultObj BACKINPORT_SUCCESS = new ResultObj(Constast.OK,"退货成功");
//    public static final ResultObj BACKINPORT_ERROR = new ResultObj(Constast.ERROR,"退货失败");
//    public static final ResultObj SYNCCACHE_SUCCESS = new ResultObj(Constast.OK,"同步缓存成功");
//
//    public static final ResultObj DELETE_ERROR_NEWS = new ResultObj(Constast.ERROR,"删除用户失败，该用户是其他用户的直属领导，请先修改该用户的下属的直属领导，再进行删除操作");
//    public static final ResultObj DELETE_QUERY = new ResultObj();
//

}
