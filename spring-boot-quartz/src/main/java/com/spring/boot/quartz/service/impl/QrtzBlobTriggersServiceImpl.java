package com.spring.boot.quartz.service.impl;

import com.spring.boot.quartz.entity.QrtzBlobTriggers;
import com.spring.boot.quartz.mapper.QrtzBlobTriggersMapper;
import com.spring.boot.quartz.service.QrtzBlobTriggersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author rock
 * @since 2022-08-17
 */
@Service
public class QrtzBlobTriggersServiceImpl extends ServiceImpl<QrtzBlobTriggersMapper, QrtzBlobTriggers> implements QrtzBlobTriggersService {

}
