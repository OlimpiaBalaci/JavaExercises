package sda.exercises;

public class Operand {
    private Object left;
    private Object right;
    private String operator;

    public Operand(String expression) {
        expression = expression.substring(1, expression.length() - 1);
        String[] operator = {">", "<", "<=", ">=", "==", "!="};
        for (int i = 0; i < operator.length; i++) {
            String[] result = expression.split(operator[i]);
            if (result.length != 0) {
                this.left = result[0];
                this.right = result[1];
                this.operator = operator[i];
                break;
            }
        }
    }

    public Object getLeft() {
        return left;
    }

    public void setLeft(Object left) {
        this.left = left;
    }

    public Object getRight() {
        return right;
    }

    public void setRight(Object right) {
        this.right = right;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public static String pickUpExpressions(String expressions) {
        //if we have more than one expression, return all the expressions
        //delete spaces
        expressions = expressions.replace(" ", "");
        //delete if word
        expressions = expressions.replace("if", "");
        if (expressions.length() > 4) {
            return expressions;
        } else {
            expressions = expressions.substring(1, expressions.length() - 1);
            //(a<b)&&(a>c)
            //find && and ||
            return expressions;
        }


    }
}
