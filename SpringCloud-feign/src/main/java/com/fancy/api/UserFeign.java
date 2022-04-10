/**
 * @author fancy
 * @date 2022/4/9 20:34
 */
package com.fancy.api;

import com.fancy.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "feign-provider",
        decode404 = true,
        contextId = "UserFeign")
public interface UserFeign {
    @GetMapping("/getUser")
    User getUser();
}
