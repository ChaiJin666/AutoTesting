public class TestArray3 {
    public static void main(String [] args){
        String str ="helloworld";
        char [] data =str.toCharArray();
        for(int x=0;x<data.length;x++){
            System.out.print(data[x]+" ");
            data[x] -=32;
            System.out.print(data[x]+" ");
        }
        System.out.println(new String(data));
    }
}

/*
a 对应的是97  A对应的是65  大写小写之间刚好相差32
data[x]-=32,意思就是将数组的小写转化为大写
 */