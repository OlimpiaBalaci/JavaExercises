package sda.exercises;

public class Operand {
  private Object left;
    private Object right;
    private String operator;

    public Operand(String expresion) {
        expresion = expresion.substring(1,expresion.length()-1);
        String[] operator = {">","<","<=",">=","==","!="};
        for (int i = 0; i < operator.length ; i++) {
            String[] result = expresion.split(operator[i]);
            if(result.length != 0)
            {
                this.left = result[0];
                this.right = result[1];
                this.operator = operator[i];
                break;
            }
        }

    }
}
