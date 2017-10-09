/*
* Copyright (c) 2017 sunvalley. All Rights Reserved.
*/
package com.sunvalley.erp.to.product;

import java.util.List;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: douglas.jiang
 * @Date: 2017-10-10 16:59
 */
public class SkuMarketInfoTO {
    private List<ItemLocaleReviewTO> itemLocaleReviews;
    private List<ItemRequirementsTO> itemRequirements;

    public List<ItemLocaleReviewTO> getItemLocaleReviews() {
        return itemLocaleReviews;
    }

    public void setItemLocaleReviews(List<ItemLocaleReviewTO> itemLocaleReviews) {
        this.itemLocaleReviews = itemLocaleReviews;
    }

    public List<ItemRequirementsTO> getItemRequirements() {
        return itemRequirements;
    }

    public void setItemRequirements(List<ItemRequirementsTO> itemRequirements) {
        this.itemRequirements = itemRequirements;
    }
}

