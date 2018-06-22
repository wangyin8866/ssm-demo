package com.loan.base.utils;

import com.loan.base.domain.Result;
import lombok.Getter;
import lombok.Setter;

/**
 * @author : wyman
 * @date : 2018/6/22 10:50
 * description：
 */
@Setter
@Getter
public class ResultJSON {
    public static Result success(Object o) {
        Result<Object> result = new Result<>();
        result.setCode(1);
        result.setMsg("成功！");
        result.setData(o);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
