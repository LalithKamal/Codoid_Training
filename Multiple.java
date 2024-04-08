import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class Multiple {
    public static void main (String args[]) throws FilloException {
        Fillo fillo = new Fillo();
        Connection connection=fillo.getConnection("C:\\Users\\LalithKamal\\OneDrive\\Desktop\\STUD_Details.xlsx");
        Recordset recordset=connection.executeQuery("Select * from Sheet1 where ID='6' and NAME='Fernando' and GRADES='B'");

        while(recordset.next()){
            System.out.println("ID : "+ recordset.getField("ID") + "  NAME : " + recordset.getField("NAME") + "  GRADES : " + recordset.getField("GRADES"));
        }

        recordset.close();
        connection.close();
    }
}
