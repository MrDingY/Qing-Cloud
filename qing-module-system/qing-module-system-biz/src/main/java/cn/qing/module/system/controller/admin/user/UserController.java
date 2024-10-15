package cn.qing.module.system.controller.admin.user;

import cn.hutool.core.collection.CollUtil;

import cn.qing.module.system.dal.dataobject.user.AdminUserDO;
import cn.qing.module.system.service.user.AdminUserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@Tag(name = "管理后台 - 用户")
@RestController
@RequestMapping("/system/user")
@Validated
public class UserController {

    @Resource
    private AdminUserService userService;



    @GetMapping("/get")
    @Operation(summary = "获得用户详情")
    @Parameter(name = "name", description = "编号", required = true, example = "1024")
    public Object getUser(@RequestParam("name") String name) {
        AdminUserDO user = userService.getUserByUsername(name);
        return user;
    }



}
