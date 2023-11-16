package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bean.*;

@Service
public class applyService {
  
	public static List<applyBean> app = new ArrayList<applyBean>();

	public int addapply(applyBean apply) {
		
		for (applyBean rq : app) {
			if (rq.getReid()   == apply.getReid())
				if (rq.getId()   == apply.getId())
                     return 0;
		}
		
		app.add(apply);
		
		System.out.println(app);
		System.out.println("addeditems  apply");
		return 1;

	}
	
	public List<applyBean> retrieveapply(int reid) {
		List<applyBean> filteredreq = new ArrayList<applyBean>();
		for (applyBean requ : app) {
			if (requ.getReid()==reid)
				filteredreq.add(requ);
		}
		System.out.println(filteredreq);
		return filteredreq;
	}   
	
	
	public  void deleteapply(int id) {
		for (applyBean requ : app) 
			if (requ.getId()==id)
				app.remove(requ);
		
	}

	public void adddummy(int id) {
		// TODO Auto-generated method stub
		applyBean applys = new applyBean();
		applys.setId(id);
		int i = this.addapply(applys);
		if(i==1)
		{System.out.println("apply added in dummy list ");
		}
		
		
		
	}
	
	
	
	
}
