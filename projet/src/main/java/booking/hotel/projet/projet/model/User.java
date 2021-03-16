package booking.hotel.projet.projet.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import org.springframework.context.support.BeanDefinitionDsl.Role;





@Entity
public class User
{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)// generate the primary key for the class auto incremented
private Long userId;
private String userName;
private String password;
private String adresse;
private String ville;
private String Tel;
private String email;


@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER) //cascade type all is shorthand for all of the above cascade operations.
@JoinColumn(name = "role_id")

private Role role;

public User(){

}

public User(String userName, String password, String adresse, String ville, String tel, String email, Role role) {
    this.userName = userName;
    this.password = password;
    this.adresse = adresse;
    this.ville = ville;
    this.Tel = tel;
    this.email = email;
    this.role = role;
}

public Long getUserId() {
    return userId;
}

public void setUserId(Long userId) {
    this.userId = userId;
}

public String getUserName() {
    return userName;
}

public void setUserName(String userName) {
    this.userName = userName;
}

public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}

public String getAdresse() {
    return adresse;
}

public void setAdresse(String adresse) {
    this.adresse = adresse;
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
    this.Tel = tel;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public Role getRole() {
    return role;
}

public void setRole(Role role) {
    this.role = role;
}

@Override
public int hashCode()
{
    return HashCodeBuilder.reflectionHashCode(this);
    
}
@Override //@override est utilisé pour définir une méthode qui est héritée de la classe parente.
public boolean equals(Object obj)
{
    return EqualsBuilder.reflectionEquals(this, obj);
}

@Override
public String toString()
{
    return ToStringBuilder.reflectionToString(this);
}

}