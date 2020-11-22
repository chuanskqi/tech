package com.isharefox.account.service.impl;

import com.isharefox.account.entity.Account;
import com.isharefox.account.mapper.AccountMapper;
import com.isharefox.account.service.IAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表,记录用户信息 服务实现类
 * </p>
 *
 * @author isharefox
 * @since 2020-11-22
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {

}
