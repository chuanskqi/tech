package com.isharefox.service.pay;

import com.isharefox.service.pay.model.TradePrecreateReqeust;
import com.isharefox.service.pay.model.TradePrecreateResponse;
import com.isharefox.service.pay.model.TradeQueryRequest;
import com.isharefox.service.pay.model.TradeQueryResponse;

public interface PayService {
    /**
     * 创建二维码支付订单，返回二维码
     * @param reqeust
     * @return
     */
    TradePrecreateResponse tradePrecreate(TradePrecreateReqeust reqeust);

    TradeQueryResponse tradeQuery(TradeQueryRequest request);
}