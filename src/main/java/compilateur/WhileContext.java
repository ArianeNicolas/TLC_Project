package compilateur;
import java.util.ArrayList;
/**
 * Context in a While program (in While, only functions can have a context)
 */
public class WhileContext {
    private String name;
    private ArrayList<String> parameters;
    private ArrayList<String> variables;
    private ArrayList<String> outputs;

    public WhileContext(String name) {
        assert(name != null);
        this.name = name;
        this.parameters = new ArrayList<String>();
        this.variables = new ArrayList<String>();
        this.outputs = new ArrayList<String>();
    }
    

    //GETTERS

    public String getName() {
        return name;
    }


    public ArrayList<String> getParameters() {
        return parameters;
    }

    public ArrayList<String> getVariables() {
        return variables;
    }

    public ArrayList<String> getOutputs() {
        return outputs;
    }


    //SETTERS

    public ArrayList<String> addParameter(String parameter) {
        this.parameters.add(parameter);
        return this.parameters;
    }

    public ArrayList<String> addVariable(String variable) {
        this.variables.add(variable);
        return this.variables;
    }

    public ArrayList<String> addOutput(String output) {
        this.outputs.add(output);
        return this.outputs;
    }

    @Override
    public String toString() {
        return "Name " + this.name + ", parameters : " + this.parameters + ", variables : " 
        + this.variables + ", outputs : " + this.outputs;
    }
}
