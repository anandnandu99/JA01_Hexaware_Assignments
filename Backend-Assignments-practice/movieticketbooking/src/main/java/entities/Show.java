package entities;

public class Show {
	
	    private int screeningId;
	    private long theatreId;
	    private long screenId;
	    private String movieName;
	    private long screeningDate;
	    private long screeningTime;
	    private int bookedTickets;

	    public int getBookedTickets() {
	        return bookedTickets;
	    }

	    public void setBookedTickets(int bookedTickets) {
	        this.bookedTickets = bookedTickets;
	    }

	    public long getScreeningId() {
	        return screeningId;
	    }

	    public void setScreeningId(int screeningId) {
	        this.screeningId = screeningId;
	    }

	    public long getTheatreId() {
	        return theatreId;
	    }

	    public void setTheatreId(long theatreId) {
	        this.theatreId = theatreId;
	    }

	    public long getScreenId() {
	        return screenId;
	    }

	    public void setScreenId(long screenId) {
	        this.screenId = screenId;
	    }

	    public String getMovieName() {
	        return movieName;
	    }

	    public void setMovieName(String movieName) {
	        this.movieName = movieName;
	    }

	    public long getScreeningDate() {
	        return screeningDate;
	    }

	    public void setScreeningDate(long screeningDate) {
	        this.screeningDate = screeningDate;
	    }

	    public long getScreeningTime() {
	        return screeningTime;
	    }

	    public void setScreeningTime(long screeningTime) {
	        this.screeningTime = screeningTime;
	    }
	}


