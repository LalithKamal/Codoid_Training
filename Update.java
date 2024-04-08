import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;

public class Update {
    public static void main (String args[]) throws FilloException {
    Fillo fillo=new Fillo();
    Connection connection=fillo.getConnection("C:\\Users\\LalithKamal\\OneDrive\\Desktop\\STUD_Details.xlsx");
    String strQuery="Update Sheet1 Set ADDRESS='US' where ID=7  ";
        String strQuery2="Update Sheet1 Set GRADES='F' where ID=9 ";
connection.executeUpdate(strQuery);
        connection.executeUpdate(strQuery2);
connection.close();
}}
