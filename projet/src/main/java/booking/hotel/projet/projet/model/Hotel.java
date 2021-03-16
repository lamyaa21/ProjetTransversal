package booking.hotel.projet.projet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(indexes = {@Index(name = "city_index", columnList = "city"),@Index(name = "distance_index" , columnList = "distanceFromAirport" )})
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "hotel_id")
    private Long   hotelId;
    private String adresse;
    private String nom;
    private String ville;
    private String Tel;
    private String province;
    private String rating;
    private String reviews;
    private int distanceFromAirport;

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

    public int getDistanceFromAirport() {
        return distanceFromAirport;
    }

    public void setDistanceFromAirport(int distanceFromAirport) {
        this.distanceFromAirport = distanceFromAirport;
    }

    @Override
    public int hashCode(){
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

    public Hotel(){

    }

    public Hotel(String adresse, String nom, String ville, String tel, String province, String rating, String reviews,
            int distanceFromAirport) {
                super();
        this.adresse = adresse;
        this.nom = nom;
        this.ville = ville;
        this.Tel = tel;
        this.province = province;
        this.rating = rating;
        this.reviews = reviews;
        this.distanceFromAirport = distanceFromAirport;
    }

    public Hotel(Long hotelId, String adresse, String nom, String ville, String tel, String province, String rating,
            String reviews, int distanceFromAirport) {
                super();
        this.hotelId = hotelId;
        this.adresse = adresse;
        this.nom = nom;
        this.ville = ville;
        this.Tel = tel;
        this.province = province;
        this.rating = rating;
        this.reviews = reviews;
        this.distanceFromAirport = distanceFromAirport;
    }

    

    



    

   
    
}
