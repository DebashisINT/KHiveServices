package com.breezefieldsaleskhive.features.mylearning.apiCall

import com.breezefieldsaleskhive.features.login.api.opportunity.OpportunityListApi
import com.breezefieldsaleskhive.features.login.api.opportunity.OpportunityListRepo

object LMSRepoProvider {
    fun getTopicList(): LMSRepo {
        return LMSRepo(LMSApi.create())
    }
}