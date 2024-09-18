package com.breezefieldsaleskhive.features.report.model

import com.breezefieldsaleskhive.base.BaseResponse
import com.breezefieldsaleskhive.features.nearbyshops.model.ShopData

/**
 * Created by Pratishruti on 27-12-2017.
 */
class MISResponse:BaseResponse() {
    var shop_list:List<ShopData>? = null
    var shop_list_count:MISShopListCount?=null
}