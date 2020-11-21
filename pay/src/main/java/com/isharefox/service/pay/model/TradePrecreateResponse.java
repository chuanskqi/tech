package com.isharefox.service.pay.model;

import lombok.Data;

@Data
public class TradePrecreateResponse {
    /**
     * 二维码
     */
    private String qrCode;

    /**
     * 订单号
     */
    private String outTradeNo;

}
