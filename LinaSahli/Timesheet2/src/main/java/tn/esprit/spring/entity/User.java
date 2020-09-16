package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
public class User implements Serializable{
	private static final long serialVersionUID = 6191889143079517027L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	private String emailId;
	
	private String password; 
private boolean enable;
	//private Rolee rolii;




//@Enumerated(EnumType.STRING)
@ManyToMany(fetch=FetchType.EAGER)
@JoinTable(name="USERS_ROLES",
joinColumns={@JoinColumn(name="USER_ID")},
inverseJoinColumns={@JoinColumn(name="ROLE_ID")})
private List<Role> roles;
	public List<Role> getRoles() {
	return roles;
}
public void setRoles(List<Role> roles) {
	this.roles = roles;
}
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	


	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	

	public User(@JsonProperty("emailId")String emailId,@JsonProperty("password") String password) {
		super();
		this.emailId = emailId;
		this.password = password;
	}

	public User(@JsonProperty("id")Long id, @JsonProperty("emailId")String emailId, @JsonProperty("password")String password) {
		super();
		this.id = id;
		
		this.emailId = emailId;
		this.password = password;
	}

	
	
	
	public User(String emailId, String password, boolean enable) {
		super();
		this.emailId = emailId;
		this.password = password;
		this.enable = enable;
	}
	public User( String emailId, String password, boolean enable, List<Role> roles) {
		super();
		
		this.emailId = emailId;
		this.password = password;
		this.enable = enable;
		this.roles = roles;
	}
	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [emailId=" + emailId + ", password=" + password + "]";
	}

	
	
	

}
