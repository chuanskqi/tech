package com.isharefox.pay;

import com.isharefox.common.qrcode.QrcodeUtils;
import com.isharefox.property.AssetLoader;
import com.isharefox.service.pay.PayService;
import com.isharefox.service.pay.model.TradePrecreateReqeust;
import com.isharefox.service.pay.model.TradePrecreateResponse;
import com.isharefox.view.Constant;
import com.isharefox.view.PageFactory;
import com.isharefox.view.QrPage;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
@RequestMapping("/pay")
@AllArgsConstructor
@Slf4j
public class PayController {

    final PayService payService;

    final PageFactory pageFactory;

    final AssetLoader assetLoader;

    @GetMapping("/{id}")
    public String share(@RequestParam(required = false) @PathVariable String id, Model model) {
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
