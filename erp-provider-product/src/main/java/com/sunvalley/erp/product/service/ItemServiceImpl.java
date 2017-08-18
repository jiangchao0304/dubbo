package com.sunvalley.erp.product.service;
import mapper.erp.api.product.IEcnService;
import org.springframework.stereotype.Service;


@Service
public class ItemServiceImpl implements IEcnService {

    @Override
    public String getSku(String sku) {
        return "sku-100-100";
    }
}
