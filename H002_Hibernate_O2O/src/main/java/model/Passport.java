package model;

import jakarta.persistence.*;

@Entity
@Table(name="passport")
public class Passport {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		int id;
		
		String country;
		
		String number;
		
		@OneToOne(mappedBy = "passport",cascade = CascadeType.ALL)
		Person person;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getNumber() {
			return number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		public Person getPerson() {
			return person;
		}

		public void setPerson(Person person) {
			this.person = person;
		}
		
		
		
}
