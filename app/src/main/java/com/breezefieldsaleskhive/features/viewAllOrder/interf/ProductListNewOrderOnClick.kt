package com.breezefieldsaleskhive.features.viewAllOrder.interf

import com.breezefieldsaleskhive.app.domain.NewOrderGenderEntity
import com.breezefieldsaleskhive.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}