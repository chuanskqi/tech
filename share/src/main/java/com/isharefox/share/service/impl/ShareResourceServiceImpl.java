package com.isharefox.share.service.impl;

import com.isharefox.share.entity.ShareResource;
import com.isharefox.share.mapper.ShareResourceMapper;
import com.isharefox.share.service.IShareResourceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 资源表,记录用户分享记录 服务实现类
 * </p>
 *
 * @author isharefox
 * @since 2020-11-22
 */
@Service
public class ShareResourceServiceImpl extends ServiceImpl<ShareResourceMapper, ShareResource> implements IShareResourceService {

}
