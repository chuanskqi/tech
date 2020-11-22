package com.isharefox.account.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户支付账户表,记录支付宝，微信等账户号
 * </p>
 *
 * @author isharefox
 * @since 2020-11-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PayAccount implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 外键，account用户id
     */
    private Integer accountId;

    /**
     * 支付账户号
     */
    private String accountNo;

    /**
     * 支付账户户名
     */
    private String accountName;

    /**
     * 支付宝-1
     */
    private String accountType;

    /**
     * 未结算金额
     */
    private BigDecimal unSettledFee;

    /**
     * 已结算金额
     */
    private BigDecimal settledFee;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}
