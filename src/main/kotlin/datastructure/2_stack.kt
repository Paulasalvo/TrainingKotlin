package datastructure

class Stack(){
    private var head: Node?=null
    private var tail: Node?=null

    fun push(node: Node){
        if (head==null){
            head=node
            tail=node
            return
        }

        var temp: Node?=head
        while(temp != null){
            if (temp.next==null){
                temp.next=node
                tail=node
                break
            }
            temp= temp.next

        }
    }
    fun peek(): Node?{
        return tail
    }
    fun pop(): Node?{
        var temp:Node?=head
        var prev:Node?=head
        while (temp?.next != null){
            prev=temp
            temp=temp.next
        }
        prev?.next= null
        tail = prev
        return temp
    }
}

fun main(){
    val stack= Stack()
    stack.push(Node(1))
    stack.push(Node(2))
    stack.push(Node(3))
    stack.push(Node(4))
    println(stack.peek())
    println(stack.pop())
    println(stack.peek())
}