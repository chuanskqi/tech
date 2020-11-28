package com.isharefox.controller.user;
import com.isharefox.common.api.BaseResponse;
import com.isharefox.share.entity.ShareResource;
import com.isharefox.share.service.IShareResourceService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.isharefox.controller.dto.*;

@Api(value = "资源分享")
@RestController
@Validated
@RequiredArgsConstructor
@RequestMapping("/user/share")
public class ShareController {
    final IShareResourceService shareResourceService;
    private final ModelMapper modelMapper;
    @PostMapping("/resource")
    public BaseResponse insert(@RequestParam @Validated ShareResourceDto shareResourceDto) {
        ShareResource shareResource = modelMapper.map(shareResourceDto, ShareResource.class);
        return BaseResponse.builder().build();
    }
}
