package hr.ferit.mlenic.countingbirdswithdb

import android.app.Application
import android.content.Context
import hr.ferit.mlenic.countingbirdswithdb.di.appModule
//import hr.ferit.mlenic.countingbirdswithdb.di.appModule
import hr.ferit.mlenic.countingbirdswithdb.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class CountingBirdsWithDB: Application() {

    companion object{
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = this

        startKoin { androidContext(this@CountingBirdsWithDB)
        modules(appModule, viewModelModule)}
    }

}