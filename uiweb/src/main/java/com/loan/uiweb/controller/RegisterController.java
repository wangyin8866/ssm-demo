package com.loan.uiweb.controller;

import com.loan.base.domain.Result;
import com.loan.base.service.ILogininfoService;
import com.loan.base.utils.ResultJSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : wyman
 * @date : 2018/6/22 10:45
 * description：
 */
@Controller
public class RegisterController extends BaseController {
    @Autowired
    ILogininfoService logininfoService;

    @RequestMapping("/register")
    @ResponseBody
    public Result register(String username, String password) {

        try {
            logininfoService.register(username, password);

            return ResultJSON.success(logininfoService.selectAll());

        } catch (RuntimeException e) {
            return ResultJSON.error(200, e.getMessage());
        }
    }

    @RequestMapping("/checkUsername")
    @ResponseBody
    public Result checkUsername(String username) {

        Map<String, Boolean> map = new HashMap<>();
        map.put("isExist", logininfoService.checkUsername(username));

        return ResultJSON.success(map);
    }
}
