public class TestStringBuffer {
    public static void main(String args[]){
        char[] helloArray ={'r','u','n','o','o','b'};
        String helloString = new String(helloArray);
        System.out.println(helloString);
        StringBuffer sBuffer = new StringBuffer("菜鸟教程官网：");
        sBuffer.append("www");
        sBuffer.append(".runoob");
        sBuffer.append(".com");
        System.out.println(sBuffer);

    }
}
