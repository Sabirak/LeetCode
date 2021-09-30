Class MinimumDepthOfaBinaryTree{
    // A binary Tree node
static class Node{
    int data;
    Node left, right;
}

static class NodeDepth{
    Node node;
    int depth;
 
    public NodeDepth(Node node, int depth){
        this.node = node;
        this.depth = depth;
    }
}
static int minDepth(Node root){
  
    if (root == null)
        return 0;
    Queue<NodeDepth> nodes = new LinkedList<>();
    NodeDepth nodeDepthPair = new NodeDepth(root, 1);
    nodes.add(nodeDepthPair);

    while (nodes.isEmpty() == false){

        nodeDepthPair = q.peek();
        nodes.remove();  //take each node from the queue
        Node curNode = nodeDepthPair.node;
        int curDepth = nodeDepthPair.depth;
        
        if (curNode.left == null && curNode.right == null)
            return curDepth;
        
        if (curNode.left != null){
            nodeDepthPair.node = curNode.left;
            nodeDepthPair.depth = curDepth + 1;
            nodes.add(qi);
        }
        
        if (curNode.right != null){
            nodeDepthPair.node = curNode.right;
            nodeDepthPair.depth = curDepth + 1;
            nodes.add(nodeDepthPair);
        }
    }
    return 0;
}
}
