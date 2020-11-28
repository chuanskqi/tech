package com.isharefox.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShareResourceDto {
    /**
     * 资源标题
     */
    @NotBlank
    private String title;

    /**
     * 资源类型,用户可分类
     */
    @NotBlank
    private String resourceType;

    /**
     * 资源描述,填写客服联系方式等
     */
    @NotBlank
    private String detail;

    /**
     * 资源出售价格/元
     */
    @NotNull
    @DecimalMax(value = "1000", message = "资源出售价格过高")
    private BigDecimal amount;
}
