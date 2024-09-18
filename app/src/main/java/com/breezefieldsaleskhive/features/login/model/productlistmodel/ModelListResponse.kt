package com.breezefieldsaleskhive.features.login.model.productlistmodel

import com.breezefieldsaleskhive.app.domain.ModelEntity
import com.breezefieldsaleskhive.app.domain.ProductListEntity
import com.breezefieldsaleskhive.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}