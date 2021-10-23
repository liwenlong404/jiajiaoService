
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
@TableName("evaluate")
@Data
public class Evaluate {
    private int id;
    private String parentPhone;
    private String teachPhone;
    private String content;
    private String date;
    private String subject;


}
