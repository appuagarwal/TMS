package com.cg.dao;
import java.util.List;

import com.cg.entities.Trainee;

public interface TraineeDao 
{
	int insertTrainee(Trainee tr);
	void deleteTrainee(int id);
	Trainee retrieveTrainee(int id);
	List<Trainee> fetchAllTrainees();
	void modifyTrainee(Trainee tr);
}
