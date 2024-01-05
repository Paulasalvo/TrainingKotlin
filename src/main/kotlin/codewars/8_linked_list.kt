package codewars

data class Node(
    val value:Int,
    var next: Node?= null
)

class LinkedList(val head:Node){
    fun insert(node:Node){
        var temp:Node?=head
        while(temp != null){
            if (temp.next==null){
                temp.next=node
                break
            }
            temp= temp.next

        }
    }
}

fun main(){
    val linkedList= LinkedList(Node(1))
    linkedList.insert(Node(2))
    linkedList.insert(Node(3))
    print(linkedList.head)
}


