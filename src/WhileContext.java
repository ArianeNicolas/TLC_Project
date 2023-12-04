import java.util.ArrayList;

public class WhileContext {
    private String name;
    private ArrayList<String> parameters;
    private ArrayList<String> variables;
    private WhileContext parentContext;

    public WhileContext(String name, WhileContext parentContext) {
        this.name = name;
        this.parentContext = parentContext;
        this.parameters = new ArrayList<String>();
        this.variables = new ArrayList<String>();
    }
    

    //GETTERS

    public String getName() {
        return name;
    }

    public WhileContext getParentContext() {
        return parentContext;
    }

    public ArrayList<String> getParameters() {
        return parameters;
    }

    public ArrayList<String> getVariables() {
        return variables;
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

    @Override
    public String toString() {
        return "Name " + this.name + ", parameters : " + this.parameters + ", variables : " + this.variables;
    }
}
