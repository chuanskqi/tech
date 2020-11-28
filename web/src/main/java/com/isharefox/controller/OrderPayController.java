package com.isharefox.controller;

import com.isharefox.common.qrcode.QrcodeUtils;
import com.isharefox.property.AssetLoader;
import com.isharefox.pay.service.PayService;
import com.isharefox.pay.service.model.TradePrecreateReqeust;
import com.isharefox.pay.service.model.TradePrecreateResponse;
import com.isharefox.view.Constant;
import com.isharefox.view.PageFactory;
import com.isharefox.view.QrPage;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Api(value = "订单支付服务")
@Controller
@RequestMapping("/order/pay")
@AllArgsConstructor
@Slf4j
public class OrderPayController {

    final PayService payService;

    final PageFactory pageFactory;

    final AssetLoader assetLoader;

    /**
     * @param resouceId 资源
     * @return 返回该资源的二维码支付页面
     */
    @GetMapping("/{resouceId}")
    public String share(@RequestParam(required = false) @PathVariable String resouceId, Model model) {
        TradePrecreateReqeust reqeust = TradePrecreateReqeust.builder()
                .orderId("202011150001"+ new Random().nextInt(1000000))
                .amount("10.00")
                .title("资源").build();
        TradePrecreateResponse response = payService.tradePrecreate(reqeust);
        String qrImageStringBase64 = QrcodeUtils.createQrcodeBase64(response.getQrCode(), assetLoader.getAliLogFile());
        //构造页面属性
        QrPage qrPage = pageFactory.buildQrPage();
        qrPage.setQrCodeBase64("data:image/png;base64," + qrImageStringBase64);
        model.addAttribute(Constant.ATTRIBUTE_NAME_PAGE, qrPage);

        log.info("生成orderid：" + reqeust.getOrderId());
        return "qrpage";
    }
}
