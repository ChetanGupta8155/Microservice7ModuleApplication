package com.csi.service;

import com.csi.vo.Users;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Users",url = "http://localhost:9192")
public interface UsersFeignClientService {
    @GetMapping("/userss/{userId}")
    public Users getDataByUserId(@PathVariable int userId);
}
