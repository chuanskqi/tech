package com.isharefox.share.controller;
import com.isharefox.common.api.BaseResponse;
import com.isharefox.share.controller.dto.ShareResourceDto;
import com.isharefox.share.entity.ShareResource;
import com.isharefox.share.service.IShareResourceService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "资源分享")
@RestController
@Validated
@RequiredArgsConstructor
public class ShareController {
    final IShareResourceService shareResourceService;
    private final ModelMapper modelMapper;
    @PostMapping("/share/resource")
    public BaseResponse insert(@RequestParam @Validated ShareResourceDto shareResourceDto) {
        ShareResource shareResource = modelMapper.map(shareResourceDto, ShareResource.class);
        return BaseResponse.builder().build();
    }
}
