package cn.qing.module.system.service.user;

import cn.qing.module.system.dal.dataobject.user.AdminUserDO;



/**
 * 后台用户 Service 接口
 *
 * @author 芋道源码
 */
public interface AdminUserService {
    /**
     * 通过用户名查询用户
     *
     * @param username 用户名
     * @return 用户对象信息
     */
    AdminUserDO getUserByUsername(String username);

}
