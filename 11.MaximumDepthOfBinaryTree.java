class Solution {
    public int maxDepth(TreeNode root) {
        
        //Integer ;
        if(root==null){
            return 0;
        }
        
        Integer max_depthL=0,max_depthR=0,depth=0;
        SortedSet<Integer> depthMax = new TreeSet<Integer>();
            
        TreeNode rightSubTree = new TreeNode();
        TreeNode leftSubTree = new TreeNode();
        
        rightSubTree=root.right;
        max_depthR=maxDepth(rightSubTree);
        depthMax.add(max_depthR);
        
        leftSubTree=root.left;
        max_depthL=maxDepth(leftSubTree);
        depthMax.add(max_depthL);
        
        depth=depthMax.last()+1;
              
        return depth;
            
     }    
}
