package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YouxigonglueCollectionEntity;
import java.util.Map;

/**
 * 攻略收藏 服务类
 * @author 
 * @since 2021-04-20
 */
public interface YouxigonglueCollectionService extends IService<YouxigonglueCollectionEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}