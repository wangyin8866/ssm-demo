package com.loan.base.utils;

/**
 * @author : wyman
 * @date : 2018/6/22 10:17
 * description：
 */
public class LogicException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    /**
     * 异常错误码,类似于 http 响应的状态码，比如 404 代表(页面没有找到) 表用户名不存在，102 代表密码错误;
     */
    private Integer errCode;

    public Integer getErrCode() {
        return errCode;
    }

    public LogicException(String message) {
        super(message);
    }

    public LogicException(String message, Integer errCode) {
        super(message);
        this.errCode = errCode;
    }
}
