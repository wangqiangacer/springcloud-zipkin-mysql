package cn.jacken.feign;

import cn.jacken.fallback.UserClientHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@Component
@FeignClient(value = "user-provider",fallback = UserClientHystrix.class)
public interface UserClient {
      @PostMapping("/user/getUser")
      String  getUser();
}
