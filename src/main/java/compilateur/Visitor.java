package compilateur;
import java.util.HashSet;

import org.antlr.runtime.tree.CommonTree;

public abstract class Visitor {

    /**
     * Call the visit method on the tree
     * @param tree
     * @throws Exception
     */
    public void visit(CommonTree tree) throws Exception {
        HashSet<CommonTree> visitedNodes = new HashSet<CommonTree>();
        if (tree != null)
            visitRecursif(tree, visitedNodes);
    }

    /**
     * Visit the tree recursively
     * @param tree
     * @param visitedNodes
     * @throws Exception
     */
    private void visitRecursif(CommonTree tree, HashSet<CommonTree>  visitedNodes) throws Exception {
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

    /**
     * Called when entering a node
     * @param node
     */
    protected abstract void entry(CommonTree node) throws Exception;
    
    /**
     * Called when exiting a node
     * @param node
     */
    protected abstract void exit(CommonTree node) throws Exception;

}