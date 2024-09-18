package com.breezefieldsaleskhive.features.viewAllOrder.interf

import com.breezefieldsaleskhive.app.domain.NewOrderGenderEntity
import com.breezefieldsaleskhive.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}