import java.util.HashSet;

import org.antlr.runtime.tree.CommonTree;

public abstract class Visitor {

    /**
     * Call the visit method on the tree
     * @param tree
     */
    public void visit(CommonTree tree) {
        HashSet<CommonTree> visitedNodes = new HashSet<CommonTree>();
        if (tree != null)
            visitRecursif(tree, visitedNodes);
    }

    /**
     * Visit the tree recursively
     * @param tree
     * @param visitedNodes
     */
    private void visitRecursif(CommonTree tree, HashSet<CommonTree>  visitedNodes) {
        visitedNodes.add(tree);

        entry(tree);
        if (tree.getChildren() == null) return;
        
        for (Object nextTree : tree.getChildren()) {
            
            if (nextTree != null && !visitedNodes.contains((CommonTree) nextTree)) {
                visitRecursif((CommonTree) nextTree, visitedNodes);
                exit((CommonTree)nextTree);
            }
        }
    }

    protected abstract void entry(CommonTree node);
    
    protected abstract void exit(CommonTree node);

}