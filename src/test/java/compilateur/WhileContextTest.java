package compilateur;

import org.junit.jupiter.api.Test;

public class WhileContextTest {

    @Test 
    public void testAddParameter() {
        WhileContext context = new WhileContext("test", null);
        context.addParameter("p1");
        context.addParameter("p2");
        assert(context.getParameters().size() == 2);
        assert(context.getParameters().get(0).equals("p1"));
        assert(context.getParameters().get(1).equals("p2"));
    }

    @Test 
    public void testAddVariable() {
        WhileContext context = new WhileContext("test", null);
        context.addVariable("v1");
        context.addVariable("v2");
        assert(context.getVariables().size() == 2);
        assert(context.getVariables().get(0).equals("v1"));
        assert(context.getVariables().get(1).equals("v2"));
    }

    @Test 
    public void testAddOutput() {
        WhileContext context = new WhileContext("test", null);
        context.addOutput("o1");
        context.addOutput("o2");
        assert(context.getOutputs().size() == 2);
        assert(context.getOutputs().get(0).equals("o1"));
        assert(context.getOutputs().get(1).equals("o2"));
    }

    @Test
    public void testParentChildContexts() {
        WhileContext parentContext = new WhileContext("parent", null);
        parentContext.addParameter("p1");
        parentContext.addParameter("p2");
        parentContext.addVariable("v1");
        parentContext.addOutput("o1");

        WhileContext childContext = new WhileContext("child", parentContext);

        //test the parent context
        assert(parentContext.getName().equals("parent"));
        assert(parentContext.getParentContext() == null);

        assert(parentContext.getParameters().size() == 2);
        assert(parentContext.getVariables().size() == 1);
        assert(parentContext.getOutputs().size() == 1);

        //test the child context
        assert(childContext.getName().equals("child"));
        assert(childContext.getParentContext().equals(parentContext));

        assert(childContext.getParameters().size() == 0);
        assert(childContext.getVariables().size() == 0);
        assert(childContext.getOutputs().size() == 0);
    }

    @Test
    public void testNameNull() throws AssertionError {
        try {
            WhileContext context = new WhileContext(null, null);
            assert(false);
        } catch (AssertionError e) {
            assert(true);
        }     
    }


    
}
