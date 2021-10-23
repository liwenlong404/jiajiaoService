
package com.nobug.qingxinjiajiao.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NonNull;

import java.util.Date;

/**
 *
 * @author li
 * @create
 */
@TableName("reserve")
@Data
public class Reserve {
    private int id;
    @NonNull
    private String parentPhone;
    @NonNull
    private String teachPhone;
    @NonNull
    private String teachName;
    @NonNull
    private String subject;
    @NonNull
    private String date;
}