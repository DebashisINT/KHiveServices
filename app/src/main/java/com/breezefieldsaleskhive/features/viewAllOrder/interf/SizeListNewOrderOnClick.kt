package com.breezefieldsaleskhive.features.viewAllOrder.interf

import com.breezefieldsaleskhive.app.domain.NewOrderProductEntity
import com.breezefieldsaleskhive.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}