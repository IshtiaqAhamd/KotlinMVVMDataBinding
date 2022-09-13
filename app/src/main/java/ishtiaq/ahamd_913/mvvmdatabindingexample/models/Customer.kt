package ishtiaq.ahamd_913.mvvmdatabindingexample.models

class Customer
{
     private lateinit var cname:String

    constructor(cname: String) {
        this.cname = cname
    }
    fun getCname():String{
        return cname
    }
    fun setCname(pname: String){
        this.cname = pname
    }
}