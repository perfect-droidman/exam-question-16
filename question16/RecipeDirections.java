package question16;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RecipeDirections {
    private final Stack<Queue<String>> stackOfQueues;
    
    public RecipeDirections(){
        stackOfQueues = new Stack<>();
    }
    
    public void addRecipe(Queue<String> recipe){
        stackOfQueues.push(recipe);
    }
    
    public void printDirections(){
        while(!stackOfQueues.isEmpty()){
            Queue<String> ingredientDirections = stackOfQueues.pop();
            while(!ingredientDirections.isEmpty()){
                System.out.println(ingredientDirections.poll());
            }
        }
    }
    
    public static void main(String[] args) {
        RecipeDirections recipeDirections = new RecipeDirections();
        
        Queue<String> stuffedFishMornayDirections = new LinkedList<>();
        
        stuffedFishMornayDirections.add("Lay half of fish fillets in buttered baking dish");
        stuffedFishMornayDirections.add("Fry onion and celery in bacon fat. Add breadcrumbs, herbs, " +
                "salt, pepper, and hot water.");
        stuffedFishMornayDirections.add("Spread this stuffing over the fish in the pan and" +
                "with the remaining of the fish.");
        stuffedFishMornayDirections.add("Melt the butter, add the flour, then the milk and stir until smooth" +
                "and boiling. Add grated cheese, salt, pepper, and mustard.");
        stuffedFishMornayDirections.add("Pour over the fish and bake in covered dish at 350 degrees Fahrenheit " +
                "for 45 minutes.");
        recipeDirections.addRecipe(stuffedFishMornayDirections);
        
        recipeDirections.printDirections();
    }
}
