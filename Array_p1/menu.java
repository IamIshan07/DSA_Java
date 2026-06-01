
import java.util.Scanner;

public class menu {

    public static int food(String FoodItems[], String food) {
        for (int i = 0; i < FoodItems.length; i++) {
            if(FoodItems[i].equalsIgnoreCase(food)){
                return  i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String foodItems[] = {"chicken", "fish", "egg", "veg"};
        System.out.print("Enter what food you want :");
        String food = sc.next();
        int FindFoodItem = food(foodItems, food);
        if(FindFoodItem == -1){
            System.out.println("Food not avelable !!");
        }else{
            System.out.println("Your food is on index no : "+FindFoodItem);
        }
    }
}
