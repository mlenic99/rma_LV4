package hr.ferit.mlenic.mvvm.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import hr.ferit.mlenic.mvvm.data.api.ApiHelper
import hr.ferit.mlenic.mvvm.data.repository.MainRepository
import hr.ferit.mlenic.mvvm.ui.main.viewmodel.MainViewModel

class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}