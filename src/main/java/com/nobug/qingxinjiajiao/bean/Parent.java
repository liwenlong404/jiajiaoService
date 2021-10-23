
package com.nobug.qingxinjiajiao.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

/**
 *
 * @author li
 * @create
 */
@TableName("parent")
@Data
@Validated
public class Parent {
    private int id;
    @NotNull
    @NonNull
    private String phoneNum;
    @NotNull
    @NonNull
    private String password;
    private String icon;
    private String address;

}