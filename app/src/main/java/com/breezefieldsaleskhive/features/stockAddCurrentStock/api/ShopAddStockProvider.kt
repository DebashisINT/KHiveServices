package com.breezefieldsaleskhive.features.stockAddCurrentStock.api

import com.breezefieldsaleskhive.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldsaleskhive.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}