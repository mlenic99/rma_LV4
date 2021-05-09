package hr.ferit.mlenic.mvvm.data.api

import hr.ferit.mlenic.mvvm.data.model.User
import io.reactivex.Single

interface ApiService {

        fun getUsers(): Single<List<User>>
}