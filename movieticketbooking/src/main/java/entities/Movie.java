package entities;

public class Movie {


	   
	    private String movieName;
	    private long movieId;
	    private String moviePosterUrl;
	    private String movieTags;

	    public String getMovieTags() {
	        return movieTags;
	    }

	    public void setMovieTags(String movieTags) {
	        this.movieTags = movieTags;
	    }

	    public String getMovieName() {
	        return movieName;
	    }

	    public void setMovieName(String movieName) {
	        this.movieName = movieName;
	    }

	    public long getMovieId() {
	        return movieId;
	    }

	    public void setMovieId(long movieId) {
	        this.movieId = movieId;
	    }

	    public String getMoviePosterUrl() {
	        return moviePosterUrl;
	    }

	    public void setMoviePosterUrl(String moviePosterUrl) {
	        this.moviePosterUrl = moviePosterUrl;
	    }

		@Override
		public String toString() {
			return "Movie [movieName=" + movieName + ", movieId=" + movieId + ", moviePosterUrl=" + moviePosterUrl
					+ ", movieTags=" + movieTags + "]";
		}
	    
	}



