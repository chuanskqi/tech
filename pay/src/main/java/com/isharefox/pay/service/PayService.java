package com.isharefox.pay.service;

import com.isharefox.pay.service.model.TradePrecreateReqeust;
import com.isharefox.pay.service.model.TradePrecreateResponse;
import com.isharefox.pay.service.model.TradeQueryRequest;
import com.isharefox.pay.service.model.TradeQueryResponse;

public interface PayService {
    /**
     * 创建二维码支付订单，返回二维码
     * @param reqeust
     * @return
     */
    TradePrecreateResponse tradePrecreate(TradePrecreateReqeust reqeust);

    TradeQueryResponse tradeQuery(TradeQueryRequest request);
}