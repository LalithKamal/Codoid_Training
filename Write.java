import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;

public class Write {

    public static void main(String[] args) throws FilloException {
        Fillo fillo=new Fillo();
        Connection connection=fillo.getConnection("C:\\Users\\LalithKamal\\OneDrive\\Desktop\\STUD_Details.xlsx");
        String strQuery="INSERT INTO sheet1(ID,NAME,GRADES,ADDRESS) VALUES('11','Michael','D','Ramnad')";

        connection.executeUpdate(strQuery);

        connection.close();
    } }

