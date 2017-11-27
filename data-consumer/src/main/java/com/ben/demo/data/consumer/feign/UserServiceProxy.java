package com.ben.demo.data.consumer.feign;

import com.ben.demo.data.provider.api.UserService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by ben on 2017/11/27.
 */
@FeignClient(value = "data-provider")
public interface UserServiceProxy extends UserService {
}
