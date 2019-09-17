package cn.jacken.fallback;

import cn.jacken.feign.UserClient;

public class UserClientHystrix implements UserClient {
    public String getUser() {
        return "系统繁忙，请稍后重试！！！";
    }
}
