package com.loan.base.service.impl;

import com.loan.base.domain.Logininfo;
import com.loan.base.mapper.LogininfoMapper;
import com.loan.base.service.ILogininfoService;
import com.loan.base.utils.LogicException;
import com.loan.base.utils.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : wyman
 * @date : 2018/6/22 10:03
 * description：
 */
@Service
public class LogininfoServiceImpl implements ILogininfoService {
    @Autowired
    private LogininfoMapper logininfoMapper;

    @Override
    public void register(String username, String password) {
        int count = logininfoMapper.selectCountByUserName(username);
        if (count <= 0) {
            Logininfo logininfo = new Logininfo();
            logininfo.setUsername(username);
            logininfo.setPassword(MD5.encode(password));
            logininfo.setState(Logininfo.STATE_NORMAL);
            logininfoMapper.insert(logininfo);

        } else {
            throw new LogicException("用户名已经存在");
        }
    }

    @Override
    public List<Logininfo> selectAll() {
        return logininfoMapper.selectAll();
    }

    @Override
    public Boolean checkUsername(String username) {
        return logininfoMapper.selectCountByUserName(username)> 0;
    }


}
