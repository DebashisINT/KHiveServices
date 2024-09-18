package com.breezefieldsaleskhive.features.orderList.model

import com.breezefieldsaleskhive.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}