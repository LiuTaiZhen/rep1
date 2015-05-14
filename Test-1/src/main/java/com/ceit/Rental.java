package com.ceit;

/**
 * Created by 刘台振 on 14-12-4.
 */
public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie,int _daysRented){
      _movie=movie;
       _daysRented=_daysRented;
    }

    public int getDaysRented(){
     return _daysRented;
    }
    public Movie getMovie(){
     return  _movie;

    }
}
