package booking.hotel.projet.projet.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


    
@Entity
@Table(indexes = { @Index(name = "checkindate_index", columnList = "checkInDate"),@Index(name = "checkindate_index" , columnList = "checkOutDate")})

public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "reservation_id")
    private Long reservationId;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;
    private Date checkInDate;
    private Date checkOutDate;
    private Date ReservationDate;

    @ManyToOne
    @JoinColumn(name = "chambre_reserve_id")
    private Chambre chambrereserve;
    
    private int noChambres;
    private String reservationCas;

    public Long getreservationId() {
        return reservationId;
    }

    public void setreservationId(Long reservationId) {
        this.reservationId = reservationId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public Date getReservationDate() {
        return ReservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        ReservationDate = reservationDate;
    }

    public Chambre getChambrereserve() {
        return chambrereserve;
    }

    public void setChambrereserve(Chambre chambrereserve) {
        this.chambrereserve = chambrereserve;
    }

    public int getNoChambres() {
        return noChambres;
    }

    public void setNoChambres(int noChambres) {
        this.noChambres = noChambres;
    }

    public String getReservationCas() {
        return reservationCas;
    }

    public void setReservationCas(String reservationCas) {
        this.reservationCas = reservationCas;
    }

    @Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

    public Reservation(){
        super();
    }

    public Reservation(User user, Hotel hotel, Date checkInDate, Date checkOutDate, Date reservationDate,
            Chambre chambrereserve, int noChambres, String reservationCas) {
        this.user = user;
        this.hotel = hotel;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        ReservationDate = reservationDate;
        this.chambrereserve = chambrereserve;
        this.noChambres = noChambres;
        this.reservationCas = reservationCas;
    }

    

    


}





