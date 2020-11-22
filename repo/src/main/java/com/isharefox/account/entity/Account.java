package com.isharefox.account.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户表,记录用户信息
 * </p>
 *
 * @author isharefox
 * @since 2020-11-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 昵称
     */
    private String name;

    /**
     * 电话号码
     */
    private String phoneNumber;

    /**
     * 用户状态控制
     */
    private String status;

    private String passwordHash;

    private String photoUrl;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}
