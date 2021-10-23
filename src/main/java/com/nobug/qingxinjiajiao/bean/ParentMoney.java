
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
@TableName("par_money")
@Data
public class ParentMoney {
    private int id;
    @NonNull
    private String phoneNum;
    @NonNull
    private String parentBalance;
    @NonNull
    private String yue;
    @NonNull
    private String jifen;
}