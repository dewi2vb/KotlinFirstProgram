fun main(args: Array<String>) {
    var varBool : Boolean = true
    if(varBool)
        println("varBool bernilai " + varBool)
    var varInt : Int = 1
    if(varInt) //kode ini menyebabkan eror karana diisi tipe data int harusnya boolean
        println("varInt bernilai " + varInt)
}
