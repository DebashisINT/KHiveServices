package com.breezefieldsaleskhive.features.photoReg.model

import com.breezefieldsaleskhive.features.stockAddCurrentStock.model.CurrentStockGetDataDtls

class GetUserListResponse {
    var status:String ? = null
    var message:String ? = null
    var user_list :ArrayList<UserListResponseModel>? = null
}