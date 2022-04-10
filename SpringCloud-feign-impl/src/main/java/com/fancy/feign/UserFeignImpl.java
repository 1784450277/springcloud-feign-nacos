package com.fancy.feign;

import com.fancy.api.UserFeign;
import com.fancy.model.User;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fancy
 * @date 2022/4/9 20:35
 */
@RestController
public class UserFeignImpl implements UserFeign {
    @Override
    public User getUser() {
        return new User("张三","123456");
    }
}