import java.io.*;

public class SerializeDemo {
    public static void main(String [] args){
        Employee e = new Employee();
        e.name = "Reyan Ali";
        e.address ="jianghong rode";
        e.SSN = 1234;
        e.number = 101 ;
        try{
            FileOutputStream fileOut = new FileOutputStream("/temp/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /temp/employee.ser");
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}

