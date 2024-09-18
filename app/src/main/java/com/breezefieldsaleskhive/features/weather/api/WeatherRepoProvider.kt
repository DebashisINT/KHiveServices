package com.breezefieldsaleskhive.features.weather.api

import com.breezefieldsaleskhive.features.task.api.TaskApi
import com.breezefieldsaleskhive.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}