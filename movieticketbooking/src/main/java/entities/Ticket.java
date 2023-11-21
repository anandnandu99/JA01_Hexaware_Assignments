package entities;

public class Ticket {

	   
	    private long ticketId;
	    private long screeningId;
	    private int seatNum;

	    public long getTicketId() {
	        return ticketId;
	    }

	    public void setTicketId(long ticketId) {
	        this.ticketId = ticketId;
	    }

	    public long getScreeningId() {
	        return screeningId;
	    }

	    public void setScreeningId(long screeningId) {
	        this.screeningId = screeningId;
	    }

	    public int getSeatNum() {
	        return seatNum;
	    }

	    public void setSeatNum(int seatNum) {
	        this.seatNum = seatNum;
	    }

		@Override
		public String toString() {
			return "Ticket [ticketId=" + ticketId + ", screeningId=" + screeningId + ", seatNum=" + seatNum + "]";
		}
	    
	}


