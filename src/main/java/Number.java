public class Number {
    public static void main(String [] args){
        Integer i1=200;
        Integer i2=200;
        /**==和equals的区别
         * ==是比较的是对象的地址
         * equals比较的是对象的内容
         *
         */


        if(i1==i2){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
