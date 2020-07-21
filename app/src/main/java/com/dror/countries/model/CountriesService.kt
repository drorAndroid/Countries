package com.dror.countries.model

import com.dror.countries.di.DaggerAPIComponent
import io.reactivex.Single
import javax.inject.Inject

class CountriesService {
    @Inject
    lateinit var api: CountriesAPI

    init {
        DaggerAPIComponent.create().inject(this)
    }

    fun getCountries(): Single<List<Country>> {
        return api.getCountries()
    }
}