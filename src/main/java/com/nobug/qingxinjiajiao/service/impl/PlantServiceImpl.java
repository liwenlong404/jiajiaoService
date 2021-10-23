
package com.nobug.qingxinjiajiao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nobug.qingxinjiajiao.bean.Parent;
import com.nobug.qingxinjiajiao.bean.Plant;
import com.nobug.qingxinjiajiao.mapper.ParentMapper;
import com.nobug.qingxinjiajiao.mapper.PlantMapper;
import com.nobug.qingxinjiajiao.service.PlantService;
import org.springframework.stereotype.Service;

/**
 *
 * @author li
 * @create
 */
@Service
public class PlantServiceImpl extends ServiceImpl<PlantMapper, Plant> implements PlantService {

}