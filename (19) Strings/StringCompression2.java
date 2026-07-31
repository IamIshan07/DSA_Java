
public class StringCompression2 {

    public static void main(String[] args) {
        // StringBuilder str = new StringBuilder("");
        String str = "aaabbcccdd";
        System.out.print("The compressed string is : "+compressString(str));
    }   

    public static String compressString(String str) {
        StringBuilder str1 = new StringBuilder("");/* a3 */
        for (int i = 0; i < str.length(); i++) {/*i = 0,- 1,2,3,4*/
            char ch = str.charAt(i);/*a,- b*/  
            Integer count = 1; /*1,- 2,3 ...... - 1,2*/
            while(i<str.length()-1 && ch == str.charAt(i+1)){ /*7 */
                count++;
                i++;
            }
            str1.append(str.charAt(i));
            if(count >1){
                // str1.append(count.toString());
                str1.append(count);
            }
        }

        return str1.toString();
    }
}
