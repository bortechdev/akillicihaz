package proje.Kullanici;

import java.sql.*;

public class KullaniciRepositoryPostreSQL implements IKullaniciRepository {
	private static String url = "jdbc:postgresql://localhost:5432/Proje";
	private static String user = "postgres";
	private static String password = "123456";
	
    private Connection baglan(){
        Connection conn=null;
        try {
            conn = DriverManager.getConnection(url,user, password);
            if (conn != null)
                System.out.println("Veritabanina baglandi");
            else
                System.out.println("Baglanti girisimi basarisiz");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

	@Override
	public Kullanici getKullanici(String id) {
		try{
			Connection conn = baglan();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM \"Kullanici\"");

            conn.close();

            while(rs.next()){
            	String rsId = rs.getString(1);
            	String rsSifre = rs.getString(2);
            	if(rsId.equals(id))return new Kullanici(rsId,rsSifre);
            }

            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
		return null;
	}
    
}

