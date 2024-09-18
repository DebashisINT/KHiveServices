package com.breezefieldsaleskhive.features.newcollection.model

import com.breezefieldsaleskhive.app.domain.CollectionDetailsEntity
import com.breezefieldsaleskhive.base.BaseResponse
import com.breezefieldsaleskhive.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}