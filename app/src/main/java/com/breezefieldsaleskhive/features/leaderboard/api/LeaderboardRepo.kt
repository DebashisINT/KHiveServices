package com.breezefieldsaleskhive.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezefieldsaleskhive.app.FileUtils
import com.breezefieldsaleskhive.app.Pref
import com.breezefieldsaleskhive.base.BaseResponse
import com.breezefieldsaleskhive.features.addshop.model.AddLogReqData
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
import com.breezefieldsaleskhive.features.dashboard.presentation.DashboardActivity
import com.breezefieldsaleskhive.features.login.model.WhatsappApiData
import com.breezefieldsaleskhive.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}