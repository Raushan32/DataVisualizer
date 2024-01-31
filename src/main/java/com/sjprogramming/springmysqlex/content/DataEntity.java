
package com.sjprogramming.springmysqlex.content;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cv")
public class DataEntity {
	@Id
    @GeneratedValue
    private Long my_id;

    private String intensity;
    private String likelihood;
    private String relevance;
    private String Years;
    private String country;
    private String topics;
    private String region;
    private String city;
	public Long getId() {
		return my_id;
	}

	public void setId(Long id) {
		this.my_id = id;
	}
	public String getIntensity() {
		return intensity;
	}
	public void setIntensity(String intensity) {
		this.intensity = intensity;
	}
	public String getLikelihood() {
		return likelihood;
	}
	public void setLikelihood(String likelihood) {
		this.likelihood = likelihood;
	}
	public String getRelevance() {
		return relevance;
	}
	public void setRelevance(String relevance) {
		this.relevance = relevance;
	}
	public String getYear() {
		return Years;
	}
	public void setYear(String year) {
		this.Years = year;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getTopics() {
		return topics;
	}
	public void setTopics(String topics) {
		this.topics = topics;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "DataEntity [id=" + my_id + ", intensity=" + intensity + ", likelihood=" + likelihood + ", relevance="
				+ relevance + ", year=" + Years + ", country=" + country + ", topics=" + topics + ", region=" + region
				+ ", city=" + city + "]";
	}

    
}
