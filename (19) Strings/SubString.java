public class SubString {
    public static void main(String[] args) {
        String str = "Hello World";
        int si =0,ei=7;
        System.out.println("Substring is : "+printSubString(str, si, ei));
        


    }
    public static String printSubString(String str,int si, int ei) {
        String subStr = "";
        for(int i = si;i<ei;i++){
            subStr+=str.charAt(i);
        }
        return subStr;
    }

    
}
