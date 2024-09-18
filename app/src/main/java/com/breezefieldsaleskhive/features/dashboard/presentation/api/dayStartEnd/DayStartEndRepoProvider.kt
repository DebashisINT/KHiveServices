package com.breezefieldsaleskhive.features.dashboard.presentation.api.dayStartEnd

import com.breezefieldsaleskhive.features.stockCompetetorStock.api.AddCompStockApi
import com.breezefieldsaleskhive.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}