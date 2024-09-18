package com.breezefieldsaleskhive.features.survey.api

import com.breezefieldsaleskhive.features.photoReg.api.GetUserListPhotoRegApi
import com.breezefieldsaleskhive.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}