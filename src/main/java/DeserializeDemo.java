import java.io.*;
public class DeserializeDemo {
    public static  void main(String [] args){
        Employee e = null;
        try{
            FileInputStream fileIn = new FileInputStream("/temp/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Employee) in.readObject();
            in.close();
            fileIn.close();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (ClassNotFoundException e1) {
            System.out.println("Employee class not found");
            e1.printStackTrace();
            return;
        }
        System.out.println("Deserialized Employee...");
        System.out.println("Name:"+ e.name);
        System.out.println("Address:"+e.address);
        System.out.println("SSN:"+e.SSN);
        System.out.println("Number:"+e.number);

    }
}
