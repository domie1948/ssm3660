package com.entity.model;

import com.entity.YouxigonglueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 游戏攻略
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-20
 */
public class YouxigonglueModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String youxigonglueName;


    /**
     * 分类
     */
    private Integer youxigonglueTypes;


    /**
     * 封面
     */
    private String youxigongluePhoto;


    /**
     * 文件
     */
    private String youxigonglueFile;


    /**
     * 简介
     */
    private String youxigonglueContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：标题
	 */
    public String getYouxigonglueName() {
        return youxigonglueName;
    }


    /**
	 * 设置：标题
	 */
    public void setYouxigonglueName(String youxigonglueName) {
        this.youxigonglueName = youxigonglueName;
    }
    /**
	 * 获取：分类
	 */
    public Integer getYouxigonglueTypes() {
        return youxigonglueTypes;
    }


    /**
	 * 设置：分类
	 */
    public void setYouxigonglueTypes(Integer youxigonglueTypes) {
        this.youxigonglueTypes = youxigonglueTypes;
    }
    /**
	 * 获取：封面
	 */
    public String getYouxigongluePhoto() {
        return youxigongluePhoto;
    }


    /**
	 * 设置：封面
	 */
    public void setYouxigongluePhoto(String youxigongluePhoto) {
        this.youxigongluePhoto = youxigongluePhoto;
    }
    /**
	 * 获取：文件
	 */
    public String getYouxigonglueFile() {
        return youxigonglueFile;
    }


    /**
	 * 设置：文件
	 */
    public void setYouxigonglueFile(String youxigonglueFile) {
        this.youxigonglueFile = youxigonglueFile;
    }
    /**
	 * 获取：简介
	 */
    public String getYouxigonglueContent() {
        return youxigonglueContent;
    }


    /**
	 * 设置：简介
	 */
    public void setYouxigonglueContent(String youxigonglueContent) {
        this.youxigonglueContent = youxigonglueContent;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
