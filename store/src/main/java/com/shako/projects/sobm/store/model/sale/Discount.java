package com.shako.projects.sobm.store.model.sale;

import java.util.Date;

/**
 * Discount of products.
 *
 *
 *
 */
public class Discount {

    /**
     * Value of discount.
     */
    private Integer value;

    /**
     * Promotion Date.
     */
    private Date aPromotionDate;

    private Discount() {

    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Date getaPromotionDate() {
        return aPromotionDate;
    }

    public void setaPromotionDate(Date aPromotionDate) {
        this.aPromotionDate = aPromotionDate;
    }
}
