public class StringDemo {
    public static void main(String args[]){
        char[] helloArray ={'c','h','a','i'};
        String helloString =new String(helloArray);
        int len =helloString.length();
        System.out.println(helloString+"柴进");
        helloString ="666";
        System.out.println("字符串的长度是："+len);
        System.out.println(helloString);
    }
}
