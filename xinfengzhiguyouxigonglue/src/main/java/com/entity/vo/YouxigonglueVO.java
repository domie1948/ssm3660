package com.entity.vo;

import com.entity.YouxigonglueEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 游戏攻略
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-20
 */
@TableName("youxigonglue")
public class YouxigonglueVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 标题
     */

    @TableField(value = "youxigonglue_name")
    private String youxigonglueName;


    /**
     * 分类
     */

    @TableField(value = "youxigonglue_types")
    private Integer youxigonglueTypes;


    /**
     * 封面
     */

    @TableField(value = "youxigonglue_photo")
    private String youxigongluePhoto;


    /**
     * 文件
     */

    @TableField(value = "youxigonglue_file")
    private String youxigonglueFile;


    /**
     * 简介
     */

    @TableField(value = "youxigonglue_content")
    private String youxigonglueContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：标题
	 */
    public String getYouxigonglueName() {
        return youxigonglueName;
    }


    /**
	 * 获取：标题
	 */

    public void setYouxigonglueName(String youxigonglueName) {
        this.youxigonglueName = youxigonglueName;
    }
    /**
	 * 设置：分类
	 */
    public Integer getYouxigonglueTypes() {
        return youxigonglueTypes;
    }


    /**
	 * 获取：分类
	 */

    public void setYouxigonglueTypes(Integer youxigonglueTypes) {
        this.youxigonglueTypes = youxigonglueTypes;
    }
    /**
	 * 设置：封面
	 */
    public String getYouxigongluePhoto() {
        return youxigongluePhoto;
    }


    /**
	 * 获取：封面
	 */

    public void setYouxigongluePhoto(String youxigongluePhoto) {
        this.youxigongluePhoto = youxigongluePhoto;
    }
    /**
	 * 设置：文件
	 */
    public String getYouxigonglueFile() {
        return youxigonglueFile;
    }


    /**
	 * 获取：文件
	 */

    public void setYouxigonglueFile(String youxigonglueFile) {
        this.youxigonglueFile = youxigonglueFile;
    }
    /**
	 * 设置：简介
	 */
    public String getYouxigonglueContent() {
        return youxigonglueContent;
    }


    /**
	 * 获取：简介
	 */

    public void setYouxigonglueContent(String youxigonglueContent) {
        this.youxigonglueContent = youxigonglueContent;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
