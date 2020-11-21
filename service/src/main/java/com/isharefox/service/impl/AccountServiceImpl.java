package com.isharefox.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.isharefox.repo.entity.Account;
import com.isharefox.repo.mapper.AccountMapper;
import com.isharefox.service.IAccountService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tff
 * @since 2020-11-08
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {

}
