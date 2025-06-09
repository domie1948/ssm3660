package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YouxigonglueEntity;
import java.util.Map;

/**
 * 游戏攻略 服务类
 * @author 
 * @since 2021-04-20
 */
public interface YouxigonglueService extends IService<YouxigonglueEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}