package it.vinci.db;

import it.vinci.db.data.Mensa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DbService extends BaseDbService {

    public static List<String> selectDataPrenotazioni() {
        try {
            List<String> result = new ArrayList<>();
            Connection con = getConnection();
            PreparedStatement stmt = con.prepareStatement(
                    "select distinct data_pasto " +
                            "from prenotazioni " +
                            "order by data_pasto "
            );
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
               result.add(rs.getString("data_pasto"));
            }

            rs.close();
            stmt.close();
            con.close();
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Mensa> selectPrenotazioni(String data_pasto) {
        try {
            List<Mensa> result = new ArrayList<>();
            Connection con = getConnection();
            PreparedStatement stmt = con.prepareStatement(
                    "select distinct codice_fiscale, data_pasto, ordinazione " +
                            "from prenotazioni " +
                            "where data_pasto = ?"
            );
            stmt.setString(1, data_pasto);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
               result.add(new Mensa(rs.getString("codice_fiscale"), rs.getString("data_pasto"), rs.getString("ordinazione")));
            }

            rs.close();
            stmt.close();
            con.close();
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void insertPrenotazione(Mensa mensa) {
        try {
            Connection con = getConnection();
            PreparedStatement stmt = con.prepareStatement(
                    "insert into prenotazioni(codice_fiscale, data_pasto, ordinazione) " +
                            "values (?, CURRENT_DATE() , ?) "
            );
            stmt.setString(1, mensa.getCF());
            stmt.setString(2, mensa.getOrdinazione());
            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
