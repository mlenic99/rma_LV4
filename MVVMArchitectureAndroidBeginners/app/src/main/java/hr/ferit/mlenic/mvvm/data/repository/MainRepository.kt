package hr.ferit.mlenic.mvvm.data.repository

import hr.ferit.mlenic.mvvm.data.api.ApiHelper
import hr.ferit.mlenic.mvvm.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {
    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }
}