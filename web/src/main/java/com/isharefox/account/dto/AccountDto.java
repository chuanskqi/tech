package com.isharefox.account.dto;
import com.isharefox.common.validation.PhoneNumber;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountDto {
    /**
     * 邮箱
     */
    @NotBlank
    @Email
    private String email;

    /**
     * 昵称
     */
    @NotBlank
    private String name;

    /**
     * 电话号码
     */
    @PhoneNumber
    @NotBlank
    private String phoneNumber;

    /**
     * 用户状态控制
     */
    private String status;

    private String photoUrl;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
