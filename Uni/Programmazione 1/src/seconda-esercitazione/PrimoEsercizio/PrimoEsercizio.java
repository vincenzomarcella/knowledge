import java.util.Scanner;

public class PrimoEsercizio {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Inserisci una espressione artimetica: ");
        String expr = input.nextLine();  
        String[] exprOperands = expr.split("([+-])");
        String[] exprOperators = expr.split("([^+-]*)\\w");
        int res = 0;
        String[] operands = new String[1000];
        int counter = 0;
        for(String operand : exprOperands) {
            if(operand.equals("") == false) {
                System.out.printf("Operand: %s\n", operand);
                operands[counter] = operand;
                counter++;
            }
        }
        System.out.printf("Number of operators: %d\n", exprOperators.length);
        System.out.printf("Number of operands: %d\n", counter);
        if(exprOperators.length >= counter) {
            input.close();
            throw new Error("Invalid expression");
        }
        for (int i = 0; i <= counter-1; i++){
            String operand = operands[i];
            int numOperand = Integer.parseInt(operand);
            if(i == 0) {
                res += numOperand;
            } else {
                //System.out.printf("Operator: %s\n", exprOperators[i]);
                if(exprOperators[i].equals("+")){
                    res += numOperand;
                } else {
                    res -= numOperand;
                }
            }
        }
        System.out.printf("Result: %d\n", res);
        input.close(); 
    }
}