public class PassingArraysAsArguments{
    public static void PassingArraysAsArguments(int marks[]) {
        for(int i = 0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={85,45,87};
        PassingArraysAsArguments(marks);

        // print our marks
        for(int i = 0;i<marks.length;i++){
            System.out.println(marks[i]+" ");
        }
        
    }
}