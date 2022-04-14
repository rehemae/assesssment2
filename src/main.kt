fun main(){
    var data=CurrentAccount(7823451,"Rehema",20000)
    println(data.deposite(2000.0))
    println(data.withdraw(4500.00))
    data.details()
    var x=savingAccount(783442,"ray",7890)
    println( x.withdraw(1467.0))
    var fruit=(friend(arrayOf("Banana")))
    println(fruit)





}
//Create a classCurrentAccount with the following attributes:account
//number, account name, balance. It has the following functions:
//a.deposit(amount: Double) - Increments the balance bythe
//amount deposited



open class CurrentAccount(var accountNumber:Int, var accountName:String,var balance:Int) {
    fun deposite(amount: Double): Double {
        var money = amount
        money += balance
        return money
    }

    override fun toString(): String {
        return super.toString()
    }

    fun withdraw(amount: Double): Double {
        var s = balance-amount
        return s
    }

    fun details() {
        println("$accountName $balance operated by $accountNumber")

    }
}
class savingAccount(accountNumber: Int,accountName: String,balance: Int):CurrentAccount(accountNumber,accountName,balance) {
}


////data class User(var name:String, var weight:Int, var price:Int, var category:String) {
fun user( category:String){
   when("category"){
  "" println-> ("groceries")
 "" println-> ("hygine"
      else println("hotel")
  }

}
fun friend(name:Array<String>) {
    var num = 0
    if (num % 2 != 0) {
        println(num)
    }


}

