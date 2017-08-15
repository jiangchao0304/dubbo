package com.sunvalley.provider.product.service;
import com.sunvalley.api.product.IItemService;
import org.springframework.stereotype.Service;


@Service
public class ItemServiceImpl implements IItemService {

    @Override
    public String getSku(String sku) {
        return "sku-100-100";
    }
}
