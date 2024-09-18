package com.breezefieldsaleskhive.features.stockCompetetorStock.api

import com.breezefieldsaleskhive.base.BaseResponse
import com.breezefieldsaleskhive.features.orderList.model.NewOrderListResponseModel
import com.breezefieldsaleskhive.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezefieldsaleskhive.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}