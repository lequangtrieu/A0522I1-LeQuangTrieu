package model;

import entity.Information;
import entity.connectDB.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class InfoModel {
    private final DBConnection db;

    public InfoModel() throws Exception {
        db = new DBConnection();
    }

    public ArrayList<Information> getInfoPage() throws Exception {
        String query = "select * from Information";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Information> output = new ArrayList<>();

        try {
            conn = db.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String content = rs.getString(3);
                Information i = new Information(id, name, content);
                output.add(i);
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            db.close(conn, ps, rs);
        }
        return output;
    }

    public String getAddress(List<Information> info) throws Exception {
        for (int i = 0; i < info.size(); i++) {

            if (info.get(i).getName().equals("address")) {
                return info.get(i).getContent();
            }
        }
        return "";
    }

    public String getTel(List<Information> info) throws Exception {
        for (int i = 0; i < info.size(); i++) {
            if (info.get(i).getName().equals("tel")) {
                return info.get(i).getContent();
            }
        }
        return "";
    }

    public String getMail(List<Information> info) throws Exception {
        for (int i = 0; i < info.size(); i++) {
            if (info.get(i).getName().equals("mail")) {
                return info.get(i).getName() + ":" + info.get(i).getContent();
            }
        }
        return "";
    }

    public List<String> getOpenHours(List<Information> info) throws
            Exception {
        List<String> days = new ArrayList<>();
        for (int i = 0; i < info.size(); i++) {
            if (info.get(i).getName().contains("day")) {
                days.add(info.get(i).getName() + ": " + info.get(i).getContent());
            }
        }
        return days;
    }


    public String getUrlCover(List<Information> info) throws Exception {
        for (int i = 0; i < info.size(); i++) {
            if (info.get(i).getName().equals("imgCover")) {
                return info.get(i).getContent();
            }
        }
        return "";
    }

}
