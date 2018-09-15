package com.cg.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="trainee_31")
public class Trainee 
{
	
	@Id
	@Column(name="traineeid")
	@NotNull(message="Id is mandatory")
	private int traineeId;
	
	@Column(name="traineename")
	@NotEmpty(message="Name is mandatory")
	@Pattern(regexp="[A-Za-z]{3,15}",message="Name should contain min 3 and max 15 letters")
	private String traineeName;
	
	
	@Column(name="traineelocation")
	private String traineeLocation;
	
	@Column(name="traineedomain")
	private String traineeDomain;
	
	
	public Trainee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getTraineeId() {
		return traineeId;
	}


	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}


	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public String getTraineeDomain() {
		return traineeDomain;
	}

	public void setTraineeDomain(String traineeDomain) {
		this.traineeDomain = traineeDomain;
	}

	public String getTraineeLocation() {
		return traineeLocation;
	}

	public void setTraineeLocation(String traineeLocation) {
		this.traineeLocation = traineeLocation;
	}
	
	
}
