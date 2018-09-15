package com.cg.controller;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.cg.entities.Trainee;
import com.cg.service.TraineeService;

@Controller
public class TraineeController 
{
	@Autowired
	TraineeService traineeService;
	
	@RequestMapping("start")
	public String show(Model model)
	{
		return "login";                                //going to login.jsp page for inputing username and password
	}
	
	@RequestMapping("welcome")							
	public String showHome(@RequestParam("uname")String uname,@RequestParam("pwd")String pwd,Model model)
	{
		if(uname.equals("capgemini") && pwd.equals("corp123"))
		{
			return "welcome";						//if username and password is correct going to welcome.jsp page which is showing menu
		}
		else
		{
			return "login";							//if username and password is incorrect then again input the username and password 
		}
	}
	
	@RequestMapping("operation")
	public String menu(@RequestParam("ch") Integer ch,Model model)
	{
		Trainee tr=new Trainee();
		model.addAttribute("tr",tr);
		switch(ch)
		{
			case 1:return "insertDetails";					//insert trainee details in the database
			case 2:return "deleteTrainee";					//delete trainee from the database using trainee id
			case 3:return "modifyOperation";				//modify trainee details in the database of the existing trainee
			case 4:return "retrieveTrainee";				//retrieve single trainee from the database using trainee id
			case 5:
				List<Trainee> tlist=traineeService.getAllTrainees();
				model.addAttribute("tlist", tlist);
				return "retrieveAll";						//retrieve all trainees from the database
		}
		return null;
	}
	
	@RequestMapping("insert")
	public String insert(@Valid @ModelAttribute("tr") Trainee tr,BindingResult res,Model model)
	{
		if(res.hasErrors())
		{
			model.addAttribute("tr",tr);
			return "insertDetails";
		}
		else
		{
			traineeService.insert(tr);
			model.addAttribute("tr",tr);
			return "success";
		}
	}
	
	/*@RequestMapping("retrieveDelete")
	public String retdel(@RequestParam("id") int id,Model model)
	{
		model.addAttribute("id",id);
		Trainee tr=traineeService.retrieve(id);
		model.addAttribute("tr",tr);
		return "retrieveDelTrainee";
	}*/
	
	
	@RequestMapping("delete")
	public String del(@RequestParam("id") int id,Model model)
	{
		    //retdel(id,model);
			traineeService.delete(id);
			model.addAttribute("id",id);
			return "success";
	}
	
	
	@RequestMapping("retrieve")
	public String retrie(@RequestParam("id") int id,Model model)
	{
			model.addAttribute("id",id);
			Trainee tr=traineeService.retrieve(id);
			model.addAttribute("tr",tr);
			model.addAttribute("flag",true);
			return "retrieveTrainee";
	}
	
	@RequestMapping("modify")
	public String mod(@RequestParam("id") int id,Model model)
	{
			retrie(id,model);
			return "modifyDetails";
	}
	
	@RequestMapping("modifyoperation")
	public String modop(@Valid @ModelAttribute("tr") Trainee tr,BindingResult res,Model model)
	{
		if(res.hasErrors())
		{
			model.addAttribute("tr",tr);
			return "modifyOperation";
		}
		else
		{
			traineeService.modify(tr);
			model.addAttribute("tr",tr);
			return "success";
		}
	}

}
