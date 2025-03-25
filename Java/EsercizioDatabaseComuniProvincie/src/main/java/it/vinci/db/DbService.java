package it.vinci.db;

import it.vinci.db.data.SampleDbData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DbService extends BaseDbService {

    public static List<SampleDbData> selectUsers(String surname) {
        try {
            List<SampleDbData> result = new ArrayList<>();
            Connection con = getConnection();
            PreparedStatement stmt = con.prepareStatement(
                    "select name, surname " +
                            "from sample_db_table " +
                            "where surname = ? "
            );
            stmt.setString(1, surname);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                result.add(new SampleDbData(rs.getString("name"), rs.getString("surname")));
            }

            rs.close();
            stmt.close();
            con.close();
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void insertUser(SampleDbData sampleDbData) {
        try {
            Connection con = getConnection();
            PreparedStatement stmt = con.prepareStatement(
                    "insert into sample_db_table(name, surname) " +
                            "values (?, ?) "
            );
            stmt.setString(1, sampleDbData.getName());
            stmt.setString(2, sampleDbData.getSurname());
            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
