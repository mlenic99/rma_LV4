package hr.ferit.mlenic.countingbirdswithdb.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import hr.ferit.mlenic.countingbirdswithdb.databinding.ActivityCountingBirdsBinding
import hr.ferit.mlenic.countingbirdswithdb.model.CountingBirds

class CountingBirdsViewModel(private val birdsCounter: CountingBirds): ViewModel() {


    private val _seeRedBird = MutableLiveData<Int>(birdsCounter.seeRedBird())
    val seeRedBird: LiveData<Int> = _seeRedBird

    private val _seeGreenBird = MutableLiveData<Int>(birdsCounter.seeGreenBird())
    val seeGreenBird: LiveData<Int> = _seeGreenBird

    private val _seeBlueBird = MutableLiveData<Int>(birdsCounter.seeBlueBird())
    val seeBlueBird: LiveData<Int> = _seeBlueBird

    private val _seeYellowBird = MutableLiveData<Int>(birdsCounter.seeYellowBird())
    val seeYellowBird: LiveData<Int> = _seeYellowBird

    private val _getAll = MutableLiveData(birdsCounter.getAll())
    val getAll: LiveData<Int> = _getAll

    private val _resetAll = MutableLiveData<Int>(birdsCounter.resetAll())
    val resetAll: LiveData<Int> = _resetAll

    fun seeRedBird() {
        birdsCounter.seeRedBird()
        _seeRedBird.postValue(birdsCounter.numOfBirds)
    }


    fun seeGreenBird() {
        birdsCounter.seeGreenBird()
        _seeGreenBird.postValue(birdsCounter.numOfBirds)
    }

    fun seeBlueBird() {
        birdsCounter.seeBlueBird()
        _seeBlueBird.postValue(birdsCounter.numOfBirds)
    }

    fun seeYellowBird() {
        birdsCounter.seeYellowBird()
        _seeYellowBird.postValue(birdsCounter.numOfBirds)

    }

    fun resetAll() {
        birdsCounter.resetAll()
        _resetAll.postValue(birdsCounter.numOfBirds)
    }
}