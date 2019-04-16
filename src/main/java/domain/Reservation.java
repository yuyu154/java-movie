/*
 * Reservation.java
 */
package domain;

public class Reservation {
	Movie movie;
	int scheduleIndex;
	int buyCount;

	public Reservation(Movie movie, int scheduleIndex, int buyCount) {
		this.movie = movie;
		this.scheduleIndex = scheduleIndex;
		this.buyCount = buyCount;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("영화 이름: " + movie.getName() + "\n");
		sb.append("영화 스케줄: " + movie.getPlaySchedule(scheduleIndex));
		sb.append("영화 구입 수: " + buyCount + "\n");
		return sb.toString();
	}
}
