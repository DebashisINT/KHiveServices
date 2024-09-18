package com.breezefieldsaleskhive.features.login.model.opportunitymodel

import com.breezefieldsaleskhive.app.domain.OpportunityStatusEntity
import com.breezefieldsaleskhive.app.domain.ProductListEntity
import com.breezefieldsaleskhive.base.BaseResponse

/**
 * Created by Puja on 30.05.2024
 */
class OpportunityStatusListResponseModel : BaseResponse() {
    var status_list: ArrayList<OpportunityStatusEntity>? = null
}