fun main() {
    text()
    introduction("Dorothy", 20)
    school()
    name("dorothy")
    name("akoth")


}

fun text(){
    var text="akirachix"
    print(text[0])
    print(text[2])
    println(text[3])
}

fun introduction(name:String, age:Int){
    val sentence=( "Hi my name is $name and I am $age years old")
    println(sentence)

}

fun school(){
    val str= "Dog"
    println(str.length)

}

fun name(name:String){
    if (name=="dorothy"){
        println( "That's me!")
    }
    else{
        println("I don't know who that is")
}
}



















