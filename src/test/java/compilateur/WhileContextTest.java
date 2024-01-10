package compilateur;

import org.junit.jupiter.api.Test;

public class WhileContextTest {

    @Test 
    public void testAddParameter() {
        WhileContext context = new WhileContext("test");
        context.addParameter("p1");
        context.addParameter("p2");
        assert(context.getParameters().size() == 2);
        assert(context.getParameters().get(0).equals("p1"));
        assert(context.getParameters().get(1).equals("p2"));
    }

    @Test 
    public void testAddVariable() {
        WhileContext context = new WhileContext("test");
        context.addVariable("v1");
        context.addVariable("v2");
        assert(context.getVariables().size() == 2);
        assert(context.getVariables().get(0).equals("v1"));
        assert(context.getVariables().get(1).equals("v2"));
    }

    @Test 
    public void testAddOutput() {
        WhileContext context = new WhileContext("test");
        context.addOutput("o1");
        context.addOutput("o2");
        assert(context.getOutputs().size() == 2);
        assert(context.getOutputs().get(0).equals("o1"));
        assert(context.getOutputs().get(1).equals("o2"));
    }

    @Test
    public void testNameNull() throws AssertionError {
        try {
            WhileContext context = new WhileContext(null);
            assert(false);
        } catch (AssertionError e) {
            assert(true);
        }     
    }


    
}
