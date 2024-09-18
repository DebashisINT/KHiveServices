package com.breezefieldsaleskhive.features.newcollectionreport

import com.breezefieldsaleskhive.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}