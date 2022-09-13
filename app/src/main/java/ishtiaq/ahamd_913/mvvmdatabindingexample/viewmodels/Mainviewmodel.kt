package ishtiaq.ahamd_913.mvvmdatabindingexample.viewmodels

import androidx.lifecycle.ViewModel
import ishtiaq.ahamd_913.mvvmdatabindingexample.models.Customer

class Mainviewmodel: ViewModel()
{
    val customer = Customer("IN THE NAME OF ALLAH THE MOST MERCIFUL \nAND THE MOST BENEFICENT")

    fun  getCoustomer():Customer{
        return this.customer
    }
}