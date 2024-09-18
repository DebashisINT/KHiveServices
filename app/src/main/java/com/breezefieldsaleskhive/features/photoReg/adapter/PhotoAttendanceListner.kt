package com.breezefieldsaleskhive.features.photoReg.adapter

import com.breezefieldsaleskhive.features.photoReg.model.UserListResponseModel

interface PhotoAttendanceListner {
    fun getUserInfoOnLick(obj: UserListResponseModel)
    fun getUserInfoAttendReportOnLick(obj: UserListResponseModel)
}