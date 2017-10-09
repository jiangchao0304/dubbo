/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.product.service;

import com.sunvalley.erp.product.dao.ItemFileMapper;
import com.sunvalley.erp.product.daoEX.VideoExMapper;
import com.sunvalley.erp.product.model.ItemFile;
import com.sunvalley.erp.product.model.ItemFileExample;
import com.sunvalley.erp.to.product.ItemFileTO;
import com.sunvalley.erp.to.product.ItemVideoTO;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-10-10 17:50
 */
@Service
public class ItemFileService {

    @Autowired
    private  ItemFileMapper itemFileMapper;

    @Autowired
    private VideoExMapper videoExMapper;

    public List<ItemFileTO> listItemFile(int skuId){

        List<ItemFileTO> result = new ArrayList<>();
        ItemFileExample itemFileExample = new ItemFileExample();
        itemFileExample.createCriteria().andSkuIdEqualTo(skuId);
        List<ItemFile> itemFileList =  itemFileMapper.selectByExample(itemFileExample);

        for (ItemFile itemFile : itemFileList) {
            ItemFileTO dto = new ItemFileTO();
            try {
                BeanUtils.copyProperties(dto,itemFile);
            }catch (Exception ex){

            }

            result.add(dto);
        }

        return  result;
    }


    public List<ItemVideoTO> listItemVideo(int skuId){
        List<ItemVideoTO> result = videoExMapper.selectBySkuId(skuId);
        return  result;
    }
}

