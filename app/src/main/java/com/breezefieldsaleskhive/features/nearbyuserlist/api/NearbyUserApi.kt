package com.breezefieldsaleskhive.features.nearbyuserlist.api

import com.breezefieldsaleskhive.app.NetworkConstant
import com.breezefieldsaleskhive.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezefieldsaleskhive.features.newcollection.model.PaymentModeResponseModel
import com.breezefieldsaleskhive.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface NearbyUserApi {

    @FormUrlEncoded
    @POST("NearByTeam/List")
    fun getNearbyUserList(@Field("session_token") session_token: String, @Field("user_id") user_id: String): Observable<NearbyUserResponseModel>


    /**
     * Companion object to create the ShopDurationApi
     */
    companion object Factory {
        fun create(): NearbyUserApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setTimeOutNoRetry())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.BASE_URL)
                    .build()

            return retrofit.create(NearbyUserApi::class.java)
        }
    }
}