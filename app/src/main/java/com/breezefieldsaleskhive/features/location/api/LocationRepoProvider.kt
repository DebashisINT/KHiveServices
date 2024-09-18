package com.breezefieldsaleskhive.features.location.api

import com.breezefieldsaleskhive.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldsaleskhive.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}