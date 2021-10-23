
package com.nobug.qingxinjiajiao.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 *
 * @author li
 * @create
 */
@TableName("plant")
@Data
public class Plant {
    private int id;
    private String plantPhoneNum;
    private String plantContent;
    private String date;
}