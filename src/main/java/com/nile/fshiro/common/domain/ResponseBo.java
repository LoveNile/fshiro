package com.nile.fshiro.common.domain;

import java.util.HashMap;

public class ResponseBo extends HashMap<String, Object> {

    public static final Integer SUCCESS = 0;
    public static final Integer WARN = 1;
    public static final Integer FAIL = 500;

    public ResponseBo() {
        put("code", SUCCESS);
        put("msg", "操作成功");
    }

    public static ResponseBo error(Object msg) {
        ResponseBo responseBo = new ResponseBo();
        responseBo.put("code", WARN);
        responseBo.put("msg",msg);
        return responseBo;
    }

    public static ResponseBo ok(Object msg) {
        ResponseBo responseBo = new ResponseBo();
        responseBo.put("code", SUCCESS);
        responseBo.put("msg",msg);
        return responseBo;
    }
    public static ResponseBo ok() {
        return new ResponseBo();
    }

    public static ResponseBo error() {
        return ResponseBo.error("");
    }

    @Override
    public ResponseBo put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
