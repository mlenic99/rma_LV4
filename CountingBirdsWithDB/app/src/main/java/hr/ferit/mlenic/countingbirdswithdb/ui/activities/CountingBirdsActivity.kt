package hr.ferit.mlenic.countingbirdswithdb.ui.activities

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import hr.ferit.mlenic.countingbirdswithdb.R
import hr.ferit.mlenic.countingbirdswithdb.databinding.ActivityCountingBirdsBinding
import hr.ferit.mlenic.countingbirdswithdb.ui.viewmodels.CountingBirdsViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel


class CountingBirdsActivity : AppCompatActivity() {

    private val viewModel by viewModel<CountingBirdsViewModel>()

    private lateinit var mainBinding: ActivityCountingBirdsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainBinding = ActivityCountingBirdsBinding.inflate(layoutInflater).also {
            it.btnRed.setOnClickListener { viewModel.seeRedBird() }
            it.btnBlue.setOnClickListener { viewModel.seeBlueBird() }
            it.btnGreen.setOnClickListener { viewModel.seeGreenBird() }
            it.btnYellow.setOnClickListener { viewModel.seeYellowBird() }
            it.btnReset.setOnClickListener { viewModel.resetAll() }
        }

        setContentView(mainBinding.root)

        viewModel.getAll.observe(this, Observer { mainBinding.tvCounter.text = it.toString() })
        viewModel.seeRedBird.observe(this, Observer { mainBinding.tvCounter.setBackgroundColor(Color.RED) })
        viewModel.seeRedBird.observe(this, Observer{ mainBinding.tvCounter.setBackgroundColor(Color.RED) })
        viewModel.seeGreenBird.observe(this, Observer{ mainBinding.tvCounter.setBackgroundColor(Color.GREEN) })
        viewModel.seeBlueBird.observe(this, Observer{ mainBinding.tvCounter.setBackgroundColor(Color.BLUE) })
        viewModel.seeYellowBird.observe(this, Observer{ mainBinding.tvCounter.setBackgroundColor(Color.YELLOW) })
        viewModel.resetAll.observe(this, Observer{ mainBinding.tvCounter.text = it.toString() })
        viewModel.resetAll.observe(this, Observer{ mainBinding.tvCounter.setBackgroundColor(Color.WHITE) })


    }
}

