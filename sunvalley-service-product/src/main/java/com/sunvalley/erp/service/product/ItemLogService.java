/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.service.product;

import com.sunvalley.common.constants.Constants;
import com.sunvalley.common.util.StringUtil;
import com.sunvalley.common.util.TimeUtil;
import com.sunvalley.domain.erp.product.dto.SkuBaseInfoDTO;
import com.sunvalley.erp.dao.product.ItemLogMapper;
import com.sunvalley.erp.dao.product.WarehouseMapper;
import com.sunvalley.erp.model.product.Item;
import com.sunvalley.erp.model.product.ItemLog;
import com.sunvalley.erp.model.product.Warehouse;
import com.sunvalley.erp.model.product.WarehouseExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.attribute.standard.MediaSize;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-09-22 12:19
 */
@Service
public class ItemLogService {

    @Autowired
    private WarehouseMapper warehouseMapper;
    @Autowired
    private ItemLogMapper itemLogMapper;

    public int addItemLog(Item item,Item oldItem, int type,int userId,String userName) throws Exception {
        int result = 0;
        if (isChangeSize(item, oldItem, type)) {
            ItemLog itemLog = new ItemLog();
            itemLog.setSkuid(oldItem.getSkuid());
            itemLog.setOptype(2);
            itemLog.setInfoType(type);
            itemLog.setOpnote(getOpnoteByItem(item, oldItem, type));
            itemLog.setOpterator(userName);
            itemLog.setOpteratorid(userId);
            itemLog.setOpdate(TimeUtil.Now());
            result = itemLogMapper.insert(itemLog);
        }
        return result;
    }


    private boolean isChangeSize(Item item, Item oldItem, int type) {
        switch (type) {
            case Constants.ProductLogType.SIZE:return (item.getLen() != oldItem.getLen() || item.getWidth() != oldItem.getWidth() || item.getHeight() != oldItem.getHeight()
                    || item.getWeight() != oldItem.getWeight() || item.getVolweight() != oldItem.getVolweight());
            case Constants.ProductLogType.IS_DROP_STATUS:return (item.getIsdrop() != oldItem.getIsdrop());
            case Constants.ProductLogType.STATUS:return (item.getLineState() != oldItem.getLineState());
            default:return false;
        }
    }


    private String getOpnoteByItem(Item item, Item oldItem, int type) {
        StringBuffer buffer = new StringBuffer();
        if (type == Constants.ProductLogType.SIZE) {
            // [Basic][L(mm)*W(mm)*H(mm),Wt(g),Vol.W(g)] 0*0*0,0,0 -> 10*10*10,10,10
            String warehouse = getWhNameByWhId(oldItem.getZeroWhid());
            buffer.append("[").append(warehouse).append("]").append("[L(mm)*W(mm)*H(mm),Wt(g),Vol.W(g)] ");
            buffer.append(oldItem.getLen()).append("*").append(oldItem.getWidth()).append("*");
            buffer.append(oldItem.getHeight()).append(",").append(oldItem.getWeight()).append(",").append(oldItem.getVolweight());
            buffer.append(" -> ");
            buffer.append(item.getLen()).append("*").append(item.getWidth()).append("*");
            buffer.append(item.getHeight()).append(",").append(item.getWeight()).append(",").append(item.getVolweight());
        } else if (type == Constants.ProductLogType.IS_DROP_STATUS) {
            // Yes -> No
            appendIsDrop(oldItem.getIsdrop()==true?1:0, buffer);
            buffer.append(" -> ");
            appendIsDrop(oldItem.getIsdrop()==true?1:0, buffer);
        } else if (type == Constants.ProductLogType.STATUS) {
            // Regular_INT -> Inactive
            String warehouse = getWhNameByWhId(oldItem.getZeroWhid());
            buffer.append("[").append(warehouse).append("]");
            buffer.append(getLineState(oldItem.getLineState()));
            buffer.append(" -> ");
            buffer.append(getLineState(item.getLineState()));
        }
        return buffer.toString();
    }


    /**
     * 获取对应的LineState
     * @Author Jack.Zhou
     * @Date 2011-12-27
     */
    public  String getLineState(int line_state){
        String lineState=null;
        switch (line_state) {
            case Constants.SkuState.COMING:lineState=Constants.LineState.COMING;break;
            case Constants.SkuState.NEWARRIVAL:lineState=Constants.LineState.NEWARRIVAL;break;
            case Constants.SkuState.REGULAR:lineState=Constants.LineState.REGULAR;break;
            case Constants.SkuState.REGULAR_INT:lineState=Constants.LineState.REGULAR_INT;break;
            case Constants.SkuState.ONPROMOTION:lineState=Constants.LineState.ONPROMOTION;break;
            case Constants.SkuState.CLEARANCE:lineState=Constants.LineState.CLEARANCE;break;
            case Constants.SkuState.WILLDEACTIVATE:lineState=Constants.LineState.WILLDEACTIVATE;break;
            case Constants.SkuState.INACTIVE:lineState=Constants.LineState.INACTIVE;break;
            case Constants.SkuState.SEMIS:lineState=Constants.LineState.SEMIS;break;
            default:lineState="No Line_state";break;
        }
        return lineState;
    }

    private String getWhNameByWhId(int wh_id) {
        Warehouse warehouse =  warehouseMapper.selectByPrimaryKey(wh_id);
        if(warehouse!=null){
            return warehouse.getWhName();
        }
        else {
            return "Basic";
        }
    }


    private void appendIsDrop(int isDrop, StringBuffer buffer) {
        switch (isDrop) {
            case Constants.IsDrop.DROPSHIP:buffer.append("Yes");break;
            case Constants.IsDrop.ERP:buffer.append("No");break;
            default:break;
        }
    }
}

