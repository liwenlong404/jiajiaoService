
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
@TableName("par_reward")
@Data
public class ParentReward {
    private int id;
    @NonNull  private String phoneNum;
    @NonNull private String account;
    @NonNull private String date;
}