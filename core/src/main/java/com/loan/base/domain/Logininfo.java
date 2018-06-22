package com.loan.base.domain;

public class Logininfo {
    private static final long serialVersionUID = 1L;

    public static final int STATE_NORMAL = 0;//普通用户状态
    public static final int STATE_LOCK = 1;//用户锁定状态
    public static final int STATE_LOGOFF = -1;//用户注销状态

    private Long id;

    private String username;

    private String password;

    private Integer state = STATE_NORMAL;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}