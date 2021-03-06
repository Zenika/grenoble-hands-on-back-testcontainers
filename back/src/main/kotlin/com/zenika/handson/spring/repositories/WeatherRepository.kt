package com.zenika.handson.spring.repositories

import com.zenika.handson.spring.entities.City
import com.zenika.handson.spring.entities.HourlyWeather
import com.zenika.handson.spring.entities.Weather

interface WeatherRepository {
    fun getDailyWeather(city: City): List<Weather>
    fun getHourlyWeather(city: City): List<HourlyWeather>
}
