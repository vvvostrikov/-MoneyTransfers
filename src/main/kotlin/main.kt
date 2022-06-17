const val amount = 10_000_000;
const val percent = 0.75
const val minCommission = 35
fun main() {
    val actualCommission = (amount * percent).toInt()
    val finalCommission = if (actualCommission <= minCommission) minCommission else actualCommission
    println("Комиcсия за перевод составит $finalCommission копеек")

    }