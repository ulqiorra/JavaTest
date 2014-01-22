package net.schastny.contactmanager.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CONTACTS")
public class Contact {

	 	@Id
	    @Column(name = "ID")
	    @GeneratedValue
	    private Integer id;

	    @Column(name = "FIRSTNAME")
	    private String firstname;

	    @Column(name = "LASTNAME")
	    private String lastname;

	    @Column(name = "EMAIL")
	    private String email;

	    @Column(name = "TELEPHONE")
	    private String telephone;
	
	    // Getters and setters
	    
	    public Integer getId(){
			
			return id;
			
		}
		
		public void setId(Integer newId){
						
			id = newId;
						
		}
		
		public String getFirstname(){
				
			return firstname;
				
		}
			
		public void setFirstname(String newFirstname){
							
			firstname = newFirstname;
							
		}
		
		public String getLastname(){
			
			return lastname;
			
		}
		
		public void setLastname(String newLastname){
						
			lastname = newLastname;
						
		}
		
		public String getEmail(){
			
			return email;
			
		}
		
		public void setEmail(String newEmail){
						
			email = newEmail;
						
		}
		
		public String getTelephone(){
			
			return telephone;
			
		}
		
		public void setTelephone(String newTelephone){
						
			telephone = newTelephone;
						
		}
}
