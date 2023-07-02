package question16;

import java.util.Queue;
import java.util.Stack;

public class StackOfQueues {
    private final Stack<Queue<String>> stackOfInstructions = new Stack<>();
    private final Stack<Queue<String>> stackOfIngredients = new Stack<>();
    
    public void push(Queue<String> instructions, Queue<String> ingredients) {
        stackOfInstructions.push(instructions);
        stackOfIngredients.push(ingredients);
    }
    
    public void push(String instruction, String ingredient) {
        Queue<String> instructions = stackOfInstructions.pop();
        Queue<String> ingredients = stackOfIngredients.pop();
        instructions.add(instruction);
        ingredients.add(ingredient);
        stackOfInstructions.push(instructions);
        stackOfIngredients.push(ingredients);
    }
    
    public String pop() {
        Queue<String> instructions = stackOfInstructions.pop();
        Queue<String> ingredients = stackOfIngredients.pop();
        String instruction = instructions.remove();
        String ingredient = ingredients.remove();
        stackOfInstructions.push(instructions);
        stackOfIngredients.push(ingredients);
        return instruction + " " + ingredient;
    }
    
    public String peek() {
        Queue<String> instructions = stackOfInstructions.pop();
        Queue<String> ingredients = stackOfIngredients.pop();
        String instruction = instructions.peek();
        String ingredient = ingredients.peek();
        stackOfInstructions.push(instructions);
        stackOfIngredients.push(ingredients);
        return instruction + " " + ingredient;
    }
    
    public boolean isEmpty() {
        return stackOfInstructions.isEmpty() || stackOfIngredients.isEmpty();
    }
    
    public int size() {
        return stackOfInstructions.size() + stackOfIngredients.size();
    }
    
    public void print() {
        System.out.println(stackOfInstructions);
        System.out.println(stackOfIngredients);
    }
}
