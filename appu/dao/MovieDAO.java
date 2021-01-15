package com.xworkz.appu.dao;

import com.xworkz.appu.dto.MovieDTO;

public interface MovieDAO {
	
	public void saveMovie(MovieDTO moviedto);
	public void fetchMovie(int movieId);
    public void updateMovie(MovieDTO moviedto,int movieId);
    public void removeMovie(int movieId);
}

