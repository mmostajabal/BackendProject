import java.sql.*;  
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class CrudClass {
    private Connection _con;
    

    public CrudClass() throws SQLException, ClassNotFoundException {        
        
        this._con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_sales","root","");
    }
    
    public ResultSet ReadData(String sqlStatement){
        ResultSet result = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Statement stmt=this._con.createStatement();  
            result =stmt.executeQuery(sqlStatement);  
        }catch(Exception e){ 
            System.out.println(e);
        }  
            
        return result;
    }

    public int RunSql(String sqlStatement){
        int numberRecord = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Statement stmt=this._con.createStatement();  
            numberRecord = stmt.executeUpdate(sqlStatement);  
        }catch(Exception e){ 
            System.out.println(e);
        }  
            
        return numberRecord;
    }
    
    public static DefaultTableModel resultSetToTableModel(ResultSet rs)
        throws SQLException {

        ResultSetMetaData metaData = rs.getMetaData();

        // names of columns
        Vector<String> columnNames = new Vector<String>();
        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }

        // data of the table
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }
            data.add(vector);
        }

        return new DefaultTableModel(data, columnNames);
}
    
}
