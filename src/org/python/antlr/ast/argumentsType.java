// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.python.antlr.ListWrapper;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class argumentsType extends PythonTree {
    private ListWrapper<exprType> args;
    public ListWrapper<exprType> getArgs() {
        return args;
    }
    public void setArgs(java.util.List<exprType> args) {
        this.args = new ListWrapper<exprType>(args);
    }

    private String vararg;
    public String getVararg() {
        return vararg;
    }
    public void setVararg(String vararg) {
        this.vararg = vararg;
    }

    private String kwarg;
    public String getKwarg() {
        return kwarg;
    }
    public void setKwarg(String kwarg) {
        this.kwarg = kwarg;
    }

    private ListWrapper<exprType> defaults;
    public ListWrapper<exprType> getDefaults() {
        return defaults;
    }
    public void setDefaults(java.util.List<exprType> defaults) {
        this.defaults = new ListWrapper<exprType>(defaults);
    }


    private final static String[] fields = new String[] {"args", "vararg",
                                                          "kwarg", "defaults"};
    public String[] get_fields() { return fields; }

    public argumentsType(java.util.List<exprType> args, String vararg, String
    kwarg, java.util.List<exprType> defaults) {
        this.args = new ListWrapper<exprType>(args);
        if (args != null) {
            for(PythonTree t : args) {
                addChild(t);
            }
        }
        this.vararg = vararg;
        this.kwarg = kwarg;
        this.defaults = new ListWrapper<exprType>(defaults);
        if (defaults != null) {
            for(PythonTree t : defaults) {
                addChild(t);
            }
        }
    }

    public argumentsType(Token token, java.util.List<exprType> args, String
    vararg, String kwarg, java.util.List<exprType> defaults) {
        super(token);
        this.args = new ListWrapper<exprType>(args);
        if (args != null) {
            for(PythonTree t : args) {
                addChild(t);
            }
        }
        this.vararg = vararg;
        this.kwarg = kwarg;
        this.defaults = new ListWrapper<exprType>(defaults);
        if (defaults != null) {
            for(PythonTree t : defaults) {
                addChild(t);
            }
        }
    }

    public argumentsType(int ttype, Token token, java.util.List<exprType> args,
    String vararg, String kwarg, java.util.List<exprType> defaults) {
        super(ttype, token);
        this.args = new ListWrapper<exprType>(args);
        if (args != null) {
            for(PythonTree t : args) {
                addChild(t);
            }
        }
        this.vararg = vararg;
        this.kwarg = kwarg;
        this.defaults = new ListWrapper<exprType>(defaults);
        if (defaults != null) {
            for(PythonTree t : defaults) {
                addChild(t);
            }
        }
    }

    public argumentsType(PythonTree tree, java.util.List<exprType> args, String
    vararg, String kwarg, java.util.List<exprType> defaults) {
        super(tree);
        this.args = new ListWrapper<exprType>(args);
        if (args != null) {
            for(PythonTree t : args) {
                addChild(t);
            }
        }
        this.vararg = vararg;
        this.kwarg = kwarg;
        this.defaults = new ListWrapper<exprType>(defaults);
        if (defaults != null) {
            for(PythonTree t : defaults) {
                addChild(t);
            }
        }
    }

    public String toString() {
        return "arguments";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("arguments(");
        sb.append("args=");
        sb.append(dumpThis(args));
        sb.append(",");
        sb.append("vararg=");
        sb.append(dumpThis(vararg));
        sb.append(",");
        sb.append("kwarg=");
        sb.append(dumpThis(kwarg));
        sb.append(",");
        sb.append("defaults=");
        sb.append(dumpThis(defaults));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        traverse(visitor);
        return null;
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (args != null) {
            for (PythonTree t : args) {
                if (t != null)
                    t.accept(visitor);
            }
        }
        if (defaults != null) {
            for (PythonTree t : defaults) {
                if (t != null)
                    t.accept(visitor);
            }
        }
    }

}
