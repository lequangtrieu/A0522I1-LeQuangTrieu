/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import model.Country;
import model.Film;
import model.Genres;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class FilmDao extends DBContext {
// lấy top 6 film -> home
    public List<Film> getNewFilmTop6() {
        List<Film> films = new ArrayList<>();
        try {
            String sql = "select top 6 * from Films f \n"
                    + "left join Genres g on f.GenreID = g.GenreID \n"
                    + "left join Countries c on f.CountryCode = c.CountryCode";
            PreparedStatement stm = connection.prepareCall(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Film fl = new Film();
                fl.setFilmId(rs.getInt("FilmID"));
                fl.setTitle(rs.getString("title"));
                fl.setImage(rs.getString("img"));
                fl.setImageSlide(rs.getString("images_slide"));
                fl.setActor(rs.getString("actor"));
                fl.setAuthor(rs.getString("author"));
                fl.setDescription(rs.getString("description"));
                fl.setTime(rs.getInt("time"));
                Genres gen = new Genres();
                gen.setGenresId(rs.getInt("GenreId"));
                gen.setName(rs.getString("name"));
                fl.setGenres(gen);
                Country country = new Country();
                country.setCode(rs.getString("CountryCode"));
                country.setCountryName(rs.getString("CountryName"));
                fl.setCountry(country);
                films.add(fl);
            }
            return films;
        } catch (SQLException ex) {
            Logger.getLogger(FilmDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
