public class LargestString {
    public static void main(String[] args) {
        String[] fruits = {"Apple","mangO","Guava","mango"};
        System.out.println("The largest fruuit is : "+largestString(fruits));

        if(fruits[1].compareTo(fruits[3]) == 0){
            System.out.println("Same!");
        }else{
            System.out.println("Different !!");
        }
    }
    public static String largestString(String[] fruits) {
        String largest = fruits[0];
        for(int i = 1;i<fruits.length;i++){
            if((largest.compareToIgnoreCase(fruits[i])<0)){
                largest = fruits[i];

            }
        }

        return largest;
    }
}
