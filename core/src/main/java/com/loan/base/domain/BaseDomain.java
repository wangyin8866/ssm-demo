package com.loan.base.domain;

import java.io.Serializable;

/**
 * @author : wyman
 * @date : 2018/6/22 09:52
 * description：
 */
public class BaseDomain implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
