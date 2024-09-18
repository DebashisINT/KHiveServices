package com.breezefieldsaleskhive.features.document.api

import com.breezefieldsaleskhive.features.dymanicSection.api.DynamicApi
import com.breezefieldsaleskhive.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}