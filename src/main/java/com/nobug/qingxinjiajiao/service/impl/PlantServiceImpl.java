/**
 * FileName:   ParentServiceImpl
 * Author:     O了吗
 * Date:       2019/9/3 11:43
 * Description:
 * History:
 * author:     oleolema
 */
package com.nobug.qingxinjiajiao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nobug.qingxinjiajiao.bean.Parent;
import com.nobug.qingxinjiajiao.bean.Plant;
import com.nobug.qingxinjiajiao.mapper.ParentMapper;
import com.nobug.qingxinjiajiao.mapper.PlantMapper;
import com.nobug.qingxinjiajiao.service.PlantService;
import org.springframework.stereotype.Service;

/**
 * 〈〉
 *
 * @author O了吗
 * @create 2019/9/3
 * @since 1.0.0
 */
@Service
public class PlantServiceImpl extends ServiceImpl<PlantMapper, Plant> implements PlantService {

}