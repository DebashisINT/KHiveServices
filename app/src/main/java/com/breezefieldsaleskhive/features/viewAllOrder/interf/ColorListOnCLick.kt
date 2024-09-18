package com.breezefieldsaleskhive.features.viewAllOrder.interf

import com.breezefieldsaleskhive.app.domain.NewOrderGenderEntity
import com.breezefieldsaleskhive.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}