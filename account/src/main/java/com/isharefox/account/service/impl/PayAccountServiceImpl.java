package com.isharefox.account.service.impl;

import com.isharefox.account.entity.PayAccount;
import com.isharefox.account.mapper.PayAccountMapper;
import com.isharefox.account.service.IPayAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户支付账户表,记录支付宝，微信等账户号 服务实现类
 * </p>
 *
 * @author isharefox
 * @since 2020-11-22
 */
@Service
public class PayAccountServiceImpl extends ServiceImpl<PayAccountMapper, PayAccount> implements IPayAccountService {

}
