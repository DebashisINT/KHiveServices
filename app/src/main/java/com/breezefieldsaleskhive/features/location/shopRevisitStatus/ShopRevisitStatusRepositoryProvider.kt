package com.breezefieldsaleskhive.features.location.shopRevisitStatus

import com.breezefieldsaleskhive.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldsaleskhive.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}