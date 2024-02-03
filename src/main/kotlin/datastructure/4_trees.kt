package datastructure

data class NodeTree(
    val value:Int,
    var left:NodeTree?=null,
    var right:NodeTree?=null
)

/**
     1
    / \
   2   3
  / \
 4   5

 output: 4, 2, 5, 1, 3
 */
fun traverseInOrder(root:NodeTree?){
    if (root==null) return
    traverseInOrder(root.left)
    print(root.value.toString() + " ")
    traverseInOrder(root.right)
}
//output: 1, 2, 4, 5, 3
fun traversePreOrder(root:NodeTree?){
    if (root==null) return
    print(root.value.toString()+" ")
    traversePreOrder(root.left)
    traversePreOrder(root.right)
}

fun traversePostOrder(root:NodeTree?){
    if (root==null) return
    traversePostOrder(root.left)
    traversePostOrder(root.right)
    print(root.value.toString() + " ")
}


fun main(){
    val root:NodeTree=NodeTree(1,null)
    val leftOne=NodeTree(2,null)
    val rightOne=NodeTree(3,null)
    val leftTwo=NodeTree(4,null)
    val rightTwo=NodeTree(5,null)

    root.left=leftOne
    root.right=rightOne
    leftOne.left=leftTwo
    leftOne.right=rightTwo

    traverseInOrder(root)

    println()

    traversePreOrder(root)

    println()

    traversePostOrder(root)

}