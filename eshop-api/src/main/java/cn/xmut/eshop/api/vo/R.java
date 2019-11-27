package cn.xmut.eshop.api.vo;

import java.util.HashMap;

/**
 * @author Echo
 * @date 2019-11-27 上午11:25
 */
public class R extends HashMap<String, Object> {

    public static R ok(){
        R r = new R();
        r.put("code", 0);
        return r;
    }

    public static R ok(Object data){
        R r = new R();
        r.put("code", 0);
        r.put("data", data);
        return r;
    }

    public static R error(String msg){
        R r = new R();
        r.put("code", 1);
        r.put("msg", msg);
        return r;
    }

}
