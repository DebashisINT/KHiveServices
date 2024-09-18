package com.breezefieldsaleskhive.features.viewAllOrder.orderOptimized

import com.breezefieldsaleskhive.app.domain.ProductOnlineRateTempEntity
import com.breezefieldsaleskhive.base.BaseResponse
import com.breezefieldsaleskhive.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}