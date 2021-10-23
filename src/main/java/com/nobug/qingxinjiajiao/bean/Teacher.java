
package com.nobug.qingxinjiajiao.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NonNull;

/**
 *
 * @author li
 * @create
 */
@TableName("teacher")
@Data
public class Teacher {
    private int id;
    @NonNull
    private String teachPhone;
    @NonNull
    private String teachSex;
    @NonNull
    private String teachName;
    @NonNull
    private String teachIcon;
    @NonNull
    private String teachAddress;
    private String teachExper;
    @NonNull
    private String teachSub;
    @NonNull
    private String grade;
}