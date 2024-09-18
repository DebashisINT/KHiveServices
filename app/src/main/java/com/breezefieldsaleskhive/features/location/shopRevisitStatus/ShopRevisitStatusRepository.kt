package com.breezefieldsaleskhive.features.location.shopRevisitStatus

import com.breezefieldsaleskhive.base.BaseResponse
import com.breezefieldsaleskhive.features.location.model.ShopDurationRequest
import com.breezefieldsaleskhive.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}