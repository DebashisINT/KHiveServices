package com.breezefieldsaleskhive.features.nearbyuserlist.api

import com.breezefieldsaleskhive.app.Pref
import com.breezefieldsaleskhive.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezefieldsaleskhive.features.newcollection.model.NewCollectionListResponseModel
import com.breezefieldsaleskhive.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}