package it.vinci.db;

import it.vinci.db.data.SampleComune;
import it.vinci.db.data.SampleProvincia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DbService extends BaseDbService {

    public static List<SampleProvincia> getProvince() {
        try {
            List<SampleProvincia> result = new ArrayList<>();
            Connection con = getConnection();
            PreparedStatement stmt = con.prepareStatement(
                    "select Id " +
                            "from provincia"
            );
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                result.add(new SampleProvincia(rs.getString("Id")));
            }

            rs.close();
            stmt.close();
            con.close();
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<SampleComune> getComuni(String codProvincia) {
        try {
            List<SampleComune> result = new ArrayList<>();
            Connection con = getConnection();
            PreparedStatement stmt = con.prepareStatement(
                    "select Nome " +
                            "from comune " +
                            "where CodProvincia = ?"
            );
            stmt.setString(1, codProvincia);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                result.add(new SampleComune(rs.getString("Nome")));
            }

            rs.close();
            stmt.close();
            con.close();
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
