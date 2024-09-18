package com.breezefieldsaleskhive.features.photoReg.present

import com.breezefieldsaleskhive.app.domain.ProspectEntity
import com.breezefieldsaleskhive.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}