package hr.ferit.mlenic.mvvm.data.api

class ApiHelper(private val apiService: ApiService) {

    fun getUsers() = apiService.getUsers()

}