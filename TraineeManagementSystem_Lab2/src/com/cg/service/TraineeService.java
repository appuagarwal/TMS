package com.cg.service;
import java.util.List;

import com.cg.entities.Trainee;

public interface TraineeService
{
	int insert(Trainee tr);
	void delete(int id);
	Trainee retrieve(int id);
	List<Trainee> getAllTrainees();
	void modify(Trainee tr);
}
