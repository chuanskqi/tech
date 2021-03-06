package com.isharefox;

import com.google.gson.Gson;
import com.isharefox.account.service.IAccountService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Slf4j
public class HeartBeatController {
    final IAccountService accountService;
    @GetMapping("/heartbeat")
    public String say() {
        return "xyssss11啊啊啊";
    }

    @GetMapping("/datasouce")
    public String datasouceConnection() {
        return new Gson().toJson(accountService.list());
    }
}
