package com.breezefieldsaleskhive.features.activities.api

import com.breezefieldsaleskhive.features.member.api.TeamApi
import com.breezefieldsaleskhive.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}