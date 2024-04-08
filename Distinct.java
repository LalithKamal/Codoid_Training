import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class Distinct {
    public static void main (String args[]) throws FilloException {
        Fillo fillo = new Fillo();
        Connection connection=fillo.getConnection("C:\\Users\\LalithKamal\\OneDrive\\Desktop\\STUD_Details.xlsx");
        Recordset recordset = connection.executeQuery("SELECT DISTINCT ADDRESS FROM Sheet1");
        while (recordset.next()) {
            System.out.println(recordset.getField("ADDRESS"));
        }  }

}
