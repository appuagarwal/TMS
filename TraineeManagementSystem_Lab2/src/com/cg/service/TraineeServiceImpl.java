package com.cg.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.TraineeDao;
import com.cg.entities.Trainee;

@Service("traineeService")
@Transactional
public class TraineeServiceImpl implements TraineeService 
{
	@Autowired
	TraineeDao traineeDao;
	
	@Override
	public int insert(Trainee tr)
	{
		return traineeDao.insertTrainee(tr);
	}
	
	@Override
	public void delete(int id)
	{
		traineeDao.deleteTrainee(id);
	}
	
	@Override
	public Trainee retrieve(int id)
	{
		return traineeDao.retrieveTrainee(id);
	}
	
	public List<Trainee> getAllTrainees()
	{
		return traineeDao.fetchAllTrainees();
	}
	
	public void modify(Trainee tr)
	{
		traineeDao.modifyTrainee(tr);
	}
}
