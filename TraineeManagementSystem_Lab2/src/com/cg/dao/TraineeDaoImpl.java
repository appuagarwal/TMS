package com.cg.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import com.cg.entities.Trainee;

@Repository("traineeDao")
public class TraineeDaoImpl implements TraineeDao
{

	@PersistenceContext
	EntityManager em;
	
	@Override
	public int insertTrainee(Trainee tr) 
	{
		em.persist(tr);
		return tr.getTraineeId();
	}

	
	@Override
	public void deleteTrainee(int id)
	{
		Trainee t=em.find(Trainee.class,id);
		em.remove(t);
	}
	
	@Override
	public Trainee retrieveTrainee(int id)
	{
		Trainee t=em.find(Trainee.class,id);
		return t;
	}
	
	@Override
	public List<Trainee> fetchAllTrainees()
	{
		String jpql="SELECT t from Trainee t";
		TypedQuery<Trainee> query=em.createQuery(jpql,Trainee.class);
		return query.getResultList();
	}
	
	public void modifyTrainee(Trainee tr)
	{
		em.merge(tr);
	}
}
