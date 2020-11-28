package com.isharefox.controller.user;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.isharefox.account.entity.Account;
import com.isharefox.account.service.IAccountService;
import com.isharefox.common.validation.PhoneNumber;
import com.isharefox.controller.dto.AccountDto;
import com.isharefox.controller.dto.GenericAccountResponse;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @see com.isharefox.conf.SwaggerConfig Api doc
 */
@Api(value = "账户服务")
@RestController
@Validated
@RequiredArgsConstructor
@RequestMapping("/user/account")
public class AccountController {
    private final IAccountService accountService;
    private final ModelMapper modelMapper;

    @GetMapping(path = "/get_account_by_phonenumber")
    public GenericAccountResponse getAccountByPhoneNumber(@RequestParam @PhoneNumber String phoneNumber) {
        Account one = accountService.getOne(new QueryWrapper<Account>().lambda().eq(Account::getPhoneNumber, phoneNumber));
        return new GenericAccountResponse(modelMapper.map(one, AccountDto.class));
    }
}
