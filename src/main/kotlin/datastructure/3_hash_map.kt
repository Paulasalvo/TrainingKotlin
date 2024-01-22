package datastructure

fun playgroundHashMap(){
    val myMap: MutableMap<String, Int> = mutableMapOf()
    myMap["enero"]=20
    myMap["febrero"]=30
    myMap["marzo"]=40
    if (myMap.containsKey("marzo")){
        println(myMap["marzo"])
    }
}

fun main(){
    playgroundHashMap()
}