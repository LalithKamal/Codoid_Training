import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;


public class Main {
    public static void main(String[] args) throws FilloException {
        Fillo fillo = new Fillo();
        Connection connection = null;
        try {
            connection = fillo.getConnection("C:\\Users\\LalithKamal\\OneDrive\\Desktop\\STUD_Details.xlsx");

            String strQuery = "Select * from sheet1 where ID=5 and NAME= 'Ezhil'";
            Recordset recordset = connection.executeQuery(strQuery);

            while (recordset.next()) {
                System.out.println(recordset.getField("ID"));
                System.out.println(recordset.getField("NAME"));
                System.out.println(recordset.getField("GRADES"));
                System.out.println(recordset.getField("ADDRESS"));
            }
            recordset.close();
            connection.close();
        } catch (FilloException e) {
            throw new RuntimeException(e);
        }
    }
}