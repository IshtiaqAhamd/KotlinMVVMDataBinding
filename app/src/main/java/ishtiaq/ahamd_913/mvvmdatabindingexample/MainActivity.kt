package ishtiaq.ahamd_913.mvvmdatabindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.get
import ishtiaq.ahamd_913.mvvmdatabindingexample.databinding.ActivityMainBinding
import ishtiaq.ahamd_913.mvvmdatabindingexample.models.Customer
import ishtiaq.ahamd_913.mvvmdatabindingexample.viewmodels.Mainviewmodel

class MainActivity : AppCompatActivity() {
    private lateinit var mainviewmodel: Mainviewmodel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val mainxml: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        mainviewmodel = ViewModelProvider(this).get(Mainviewmodel::class.java)
        mainxml.setCustomer(mainviewmodel.getCoustomer())
    }
}