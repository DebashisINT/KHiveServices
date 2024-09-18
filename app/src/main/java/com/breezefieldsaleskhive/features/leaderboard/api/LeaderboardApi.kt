package com.breezefieldsaleskhive.features.leaderboard.api

import com.breezefieldsaleskhive.app.NetworkConstant
import com.breezefieldsaleskhive.base.BaseResponse
import com.breezefieldsaleskhive.features.addshop.model.AddShopRequestData
import com.breezefieldsaleskhive.features.addshop.model.AddShopResponse
import com.breezefieldsaleskhive.features.addshop.model.LogFileResponse
import com.breezefieldsaleskhive.features.addshop.model.UpdateAddrReq
import com.breezefieldsaleskhive.features.contacts.CallHisDtls
import com.breezefieldsaleskhive.features.contacts.CompanyReqData
import com.breezefieldsaleskhive.features.contacts.ContactMasterRes
import com.breezefieldsaleskhive.features.contacts.SourceMasterRes
import com.breezefieldsaleskhive.features.contacts.StageMasterRes
import com.breezefieldsaleskhive.features.contacts.StatusMasterRes
import com.breezefieldsaleskhive.features.contacts.TypeMasterRes
import com.breezefieldsaleskhive.features.login.model.WhatsappApiData
import com.breezefieldsaleskhive.features.login.model.WhatsappApiFetchData
import io.reactivex.Observable
import okhttp3.MultipartBody
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

/**
 * Created by Puja on 12-40-2014.
 */
interface LeaderboardApi {

    @FormUrlEncoded
    @POST("LeaderboardInfo/LeaderboardBranchLists")
    fun branchList(@Field("session_token") session_token: String): Observable<LeaderboardBranchData>

    @FormUrlEncoded
    @POST("LeaderboardInfo/LeaderboardOwnList")
    fun ownDatalist(@Field("user_id") user_id: String,@Field("activitybased") activitybased: String,@Field("branchwise") branchwise: String,@Field("flag") flag: String): Observable<LeaderboardOwnData>

    @FormUrlEncoded
    @POST("LeaderboardInfo/LeaderboardOverallList")
    fun overAllDatalist(@Field("user_id") user_id: String,@Field("activitybased") activitybased: String,@Field("branchwise") branchwise: String,@Field("flag") flag: String): Observable<LeaderboardOverAllData>


    /**
     * Companion object to create the GithubApiService
     */
    companion object Factory {
        fun create(): LeaderboardApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setTimeOut())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.ADD_SHOP_BASE_URL)
                    .build()

            return retrofit.create(LeaderboardApi::class.java)
        }

        fun createWithoutMultipart(): LeaderboardApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setTimeOut())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.BASE_URL)
                    .build()

            return retrofit.create(LeaderboardApi::class.java)
        }
    }
}