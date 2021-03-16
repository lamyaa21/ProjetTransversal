package booking.hotel.projet.projet.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
public class Commentaire {
    

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String text;
    private Date date;
    private boolean status;
    private boolean tareponse;
    


    @OneToOne
    private Commentaire reply;

    @JsonBackReference
    @ManyToOne
    private Hotel hotel;



    @JsonBackReference
    @ManyToOne
    private User user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isTareponse() {
        return tareponse;
    }

    public void setTareponse(boolean tareponse) {
        this.tareponse = tareponse;
    }

    public Commentaire getReply() {
        return reply;
    }

    public void setReply(Commentaire reply) {
        this.reply = reply;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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


    public Commentaire() {
    }

    public Commentaire(String text, Date date, boolean status, boolean tareponse, Hotel hotel, User user) {
        this.text = text;
        this.date = date;
        this.status = status;
        this.tareponse = false;
        this.hotel = hotel;
        this.user = user;
    }
    

    

    

    
}
