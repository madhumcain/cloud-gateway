package com.dailycode.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {
@GetMapping("/userServiceFallBack")
public String userServiceFallbackMethod()
{
    return "User service taking long time please try again";
}
    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallbackMethod()
    {
        return "department service taking long time please try again";
    }

}
