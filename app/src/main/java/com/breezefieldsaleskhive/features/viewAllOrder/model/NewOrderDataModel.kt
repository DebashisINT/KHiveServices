package com.breezefieldsaleskhive.features.viewAllOrder.model

import com.breezefieldsaleskhive.app.domain.NewOrderColorEntity
import com.breezefieldsaleskhive.app.domain.NewOrderGenderEntity
import com.breezefieldsaleskhive.app.domain.NewOrderProductEntity
import com.breezefieldsaleskhive.app.domain.NewOrderSizeEntity
import com.breezefieldsaleskhive.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

