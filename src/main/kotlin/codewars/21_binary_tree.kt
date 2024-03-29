
/**
 *
 *               (1)
 *             /     \
 *          (2)     (3)
 *        /    \
 *      (4)   (5)
 * */
class NodeTree(
    val value: Int,
    var left: NodeTree? = null,
    var right: NodeTree? = null
)

/**
 *
 *               (1)
 *             /     \
 *          (2)     (3)
 *         /  \      /  \
 *      null null  null null
 *
 * */

fun traverse(head: NodeTree?, onAction: (Int) -> Unit ) {
    if (head == null) return
    onAction(head.value)
    traverse(head.left, onAction)
    traverse(head.right, onAction)
}

fun main() {
    val head = NodeTree(1)
    head.left = NodeTree(2)
    head.right = NodeTree(3)
    head.left?.left = NodeTree(4)
    head.left?.right = NodeTree(5)

    traverse(head) {
        println(it)
    }
}