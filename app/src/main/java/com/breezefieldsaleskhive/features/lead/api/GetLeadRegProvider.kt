package com.breezefieldsaleskhive.features.lead.api

import com.breezefieldsaleskhive.features.NewQuotation.api.GetQuotListRegRepository
import com.breezefieldsaleskhive.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}