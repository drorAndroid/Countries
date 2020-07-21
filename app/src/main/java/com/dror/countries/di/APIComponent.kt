package com.dror.countries.di

import com.dror.countries.model.CountriesService
import com.dror.countries.viewmodel.ListViewModel
import dagger.Component

@Component(modules = [APIModule::class])
interface APIComponent {
    fun inject(service: CountriesService)
    fun inject(viewModel: ListViewModel)
}