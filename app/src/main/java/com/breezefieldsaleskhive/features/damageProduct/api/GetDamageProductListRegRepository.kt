package com.breezefieldsaleskhive.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.breezefieldsaleskhive.app.FileUtils
import com.breezefieldsaleskhive.base.BaseResponse
import com.breezefieldsaleskhive.features.NewQuotation.model.*
import com.breezefieldsaleskhive.features.addshop.model.AddShopRequestData
import com.breezefieldsaleskhive.features.addshop.model.AddShopResponse
import com.breezefieldsaleskhive.features.damageProduct.model.DamageProductResponseModel
import com.breezefieldsaleskhive.features.damageProduct.model.delBreakageReq
import com.breezefieldsaleskhive.features.damageProduct.model.viewAllBreakageReq
import com.breezefieldsaleskhive.features.login.model.userconfig.UserConfigResponseModel
import com.breezefieldsaleskhive.features.myjobs.model.WIPImageSubmit
import com.breezefieldsaleskhive.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}