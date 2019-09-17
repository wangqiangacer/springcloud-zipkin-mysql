package cn.jacken.Controller;

import cn.jacken.feign.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangqiang
 * @version V1.0
 * @date 2019/6/7 17:39
 */
@RestController
@RequestMapping("/consumer")
public class UserController {
    @Autowired
    private UserClient userClient;
    @RequestMapping("/user/getUser")
    public String getUseer(){
       return userClient.getUser();

    }

}
