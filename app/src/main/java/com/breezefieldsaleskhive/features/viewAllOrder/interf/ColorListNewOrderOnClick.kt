package com.breezefieldsaleskhive.features.viewAllOrder.interf

import com.breezefieldsaleskhive.app.domain.NewOrderColorEntity
import com.breezefieldsaleskhive.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}