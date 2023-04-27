import java.util.Stack;

import javax.swing.tree.TreeNode;

class NewTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        Stack<TreeNode> stackP = new Stack<>();
        Stack<TreeNode> stackQ = new Stack<>();

        TreeNode muqP, muqQ;

        stackP.add(p);
        stackQ.add(q);

        while (!(stackP.isEmpty()) && !(stackQ.isEmpty())){

            muqP = stackP.pop();
            muqQ = stackQ.pop();

            if ((muqP!=null && muqQ==null) || (muqP==null && muqQ!=null) ) return false;
            if ((muqP != null && muqQ != null) && (muqP.val != muqQ.val)) return false;

            if (muqP!=null){
                stackP.add(muqP.right);
                stackP.add(muqP.left);
            }

            if (muqQ!=null){
                stackQ.add(muqQ.right);
                stackQ.add(muqQ.left);
            }


        }


        return true;

    }
}