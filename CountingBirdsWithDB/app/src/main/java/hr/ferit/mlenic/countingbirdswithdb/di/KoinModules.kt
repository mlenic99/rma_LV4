package hr.ferit.mlenic.countingbirdswithdb.di

import hr.ferit.mlenic.countingbirdswithdb.CountingBirdsWithDB
import hr.ferit.mlenic.countingbirdswithdb.ui.viewmodels.CountingBirdsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    factory<CountingBirdsWithDB> { CountingBirdsWithDB() }
}

val viewModelModule = module {
    viewModel<CountingBirdsViewModel> {CountingBirdsViewModel(get())  }
}