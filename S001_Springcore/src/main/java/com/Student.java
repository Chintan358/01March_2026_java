package com;

import java.util.List;
import java.util.Set;

public class Student {
		
		int id;
		String name;
		String email;
		List<String> subjects;
		Set<String> languages;
		Address address;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public List<String> getSubjects() {
			return subjects;
		}
		public void setSubjects(List<String> subjects) {
			this.subjects = subjects;
		}
		public Set<String> getLanguages() {
			return languages;
		}
		public void setLanguages(Set<String> languages) {
			this.languages = languages;
		}
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		
		
}
