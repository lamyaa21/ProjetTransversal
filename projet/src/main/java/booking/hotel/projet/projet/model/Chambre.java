package booking.hotel.projet.projet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(indexes = { @Index(name = "chambre_type_index", columnList = "chambreType"),
        @Index(name = "chambre_prix_index", columnList = "chambrePrix") })
public class Chambre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "chambre_id")
    private Long chambreId;

    @ManyToOne()
    @JoinColumn(name = "hotel_id", nullable = false)
    private Hotel hotel;

    @NotNull
    private String chambreType;
    @NotNull
    private Double chambrePrix;
    @NotNull
    private Integer totalechambre;

    public Long getChambreId() {
        return chambreId;
    }

    public void setChambreId(Long chambreId) {
        this.chambreId = chambreId;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public String getChambreType() {
        return chambreType;
    }

    public void setChambreType(String chambreType) {
        this.chambreType = chambreType;
    }

    public Double getChambrePrix() {
        return chambrePrix;
    }

    public void setChambrePrix(Double chambrePrix) {
        this.chambrePrix = chambrePrix;
    }

    public Integer getTotalechambre() {
        return totalechambre;
    }

    public void setTotalechambre(Integer totalechambre) {
        this.totalechambre = totalechambre;
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ToStringBuilder.reflectionToString(this);
    }

    public Chambre() {
    }

    public Chambre(@NotNull String chambreType, @NotNull Double chambrePrix, @NotNull Integer totalechambre) {
        super();
        this.chambreType = chambreType;
        this.chambrePrix = chambrePrix;
        this.totalechambre = totalechambre;
    }

    public Chambre(Long chambreId, @NotNull String chambreType, @NotNull Double chambrePrix,
            @NotNull Integer totalechambre) {
        super();
        this.chambreId = chambreId;
        this.chambreType = chambreType;
        this.chambrePrix = chambrePrix;
        this.totalechambre = totalechambre;
    }

    
    
    
    
    

}
