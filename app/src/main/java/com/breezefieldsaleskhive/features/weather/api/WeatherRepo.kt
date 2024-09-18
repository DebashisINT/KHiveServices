package com.breezefieldsaleskhive.features.weather.api

import com.breezefieldsaleskhive.base.BaseResponse
import com.breezefieldsaleskhive.features.task.api.TaskApi
import com.breezefieldsaleskhive.features.task.model.AddTaskInputModel
import com.breezefieldsaleskhive.features.weather.model.ForeCastAPIResponse
import com.breezefieldsaleskhive.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}