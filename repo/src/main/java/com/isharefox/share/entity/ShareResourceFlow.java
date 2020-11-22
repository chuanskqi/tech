package com.isharefox.share.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 资源表订单流水表
 * </p>
 *
 * @author isharefox
 * @since 2020-11-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ShareResourceFlow implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 外键，account用户id
     */
    private Integer accountId;

    /**
     * 资源id
     */
    private Integer shareResourceId;

    /**
     * 支付订单号
     */
    private String orderId;

    /**
     * 支付宝-1
     */
    private String accountType;

    /**
     * 待支付-0,支付成功-1
     */
    private String status;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}
