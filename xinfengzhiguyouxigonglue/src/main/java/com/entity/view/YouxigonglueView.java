package com.entity.view;

import com.entity.YouxigonglueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 游戏攻略
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-20
 */
@TableName("youxigonglue")
public class YouxigonglueView extends YouxigonglueEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 分类的值
		*/
		private String youxigonglueValue;



	public YouxigonglueView() {

	}

	public YouxigonglueView(YouxigonglueEntity youxigonglueEntity) {
		try {
			BeanUtils.copyProperties(this, youxigonglueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 分类的值
			*/
			public String getYouxigonglueValue() {
				return youxigonglueValue;
			}
			/**
			* 设置： 分类的值
			*/
			public void setYouxigonglueValue(String youxigonglueValue) {
				this.youxigonglueValue = youxigonglueValue;
			}









}
