
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
@TableName("par_order")
@Data
public class ParentOrder {
    private int id;
    @NonNull
    private String parentPhone;
    @NonNull
    private String bookName;
    @NonNull
    private String count;
    @NonNull
    private String price;
    @NonNull
    private String state;

}