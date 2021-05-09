package hr.ferit.mlenic.countingbirdswithdb.model

class CountingBirds {
    var numOfBirds: Int = 0
    val getNumOfAll
        get() = numOfBirds

    fun seeRedBird() = numOfBirds++
    fun seeGreenBird() = numOfBirds++
    fun seeBlueBird() = numOfBirds++
    fun seeYellowBird() = numOfBirds++
    fun getAll() = getNumOfAll
    fun resetAll() = 0
}