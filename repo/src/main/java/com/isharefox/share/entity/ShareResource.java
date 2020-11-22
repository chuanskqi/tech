package com.isharefox.share.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 资源表,记录用户分享记录
 * </p>
 *
 * @author isharefox
 * @since 2020-11-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ShareResource implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 外键，account用户id
     */
    private Integer accountId;

    /**
     * 资源标题
     */
    private String title;

    /**
     * 资源类型,用户可分类
     */
    private String resourceType;

    /**
     * 资源描述,填写客服联系方式等
     */
    private String detail;

    /**
     * 资源出售价格/元
     */
    private BigDecimal amount;

    /**
     * 购买数,已支付次数
     */
    private Integer payCount;

    /**
     * 该资源生成二维码收款链接
     */
    private String payUrl;

    /**
     * 上下架管理
     */
    private String status;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}
