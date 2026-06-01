import java.util.*;
public class if_else{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        // int age = sc.nextInt();
        // if(age>=18 && age <= 50){
        //     System.out.println("You are an Adult");
        // }

        // else if(age >= 13 && age <18){
        //     System.out.println("You are a teenager");
        // }
        // else if(age > 50){
        //     System.out.println("You are a aged person");
        // }

        // else{
        //     System.out.println("You are a Miner");
        // }
        // sc.close();





        // ODD and EVEN .....................................
        int x = sc.nextInt();

        if(x%2 == 0){
            System.out.println(x+" is a even number.");
        }else{
            System.out.println(x+" is not a even number / odd number");
        }


    }
}