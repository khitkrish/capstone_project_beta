package com.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bean.registerBean;
import com.bean.requirementBean;
import com.bean.LoginBean;

@Service
public class registerService {
	public static List<registerBean> regist = new ArrayList<registerBean>();
	private static int count = 1;
	static {
		registerBean r = new registerBean();
		r.setFirstname("Admin");
		r.setLastname("Arbutus");
		r.setId(8080);
		r.setemail("8080");
		r.setPassword("admin");
		r.setUser("admin");
		regist.add(r);
		
		
		registerBean r1 = new registerBean();
		r1.setFirstname("harish");
		r1.setLastname("krishna");
		r1.setemail("harish@gmail.com");
        r1.setNum("4434537627");
		r1.setId(8085);
		r1.setPassword("abcd");
		r1.setUser("HR");
		regist.add(r1);
		
		registerBean r2 = new registerBean();
		r2.setFirstname("Ethan");
		r2.setLastname("Hunt");
		r2.setId(8086);
		r2.setPassword("abcd");
		r2.setemail("ethan@gmail.com");

        r2.setNum("4434537653");

		r2.setUser("HR");
		regist.add(r2);
		
		System.out.println(regist);

		System.out.println("addedadmin");
	}
	
	
	
	public List<registerBean> allusers() {
		List<registerBean> filteredreq = new ArrayList<registerBean>();
		for (registerBean requ : regist) {
			
			filteredreq.add(requ);
		}
		System.out.println(filteredreq);
		return filteredreq;
		
		
	}
	


	public void addregister(registerBean registers) {
		regist.add(registers);
		System.out.println(regist);
		System.out.println("addeditems");

	}
	int id=1000;
	public int setid(registerBean r)
	{id++;
		r.setId(id);
		return r.getId();
	}

	
	
	
	
	
	public int val(String a, String b) {

		for (registerBean r : regist) {
			if (a.equals(r.getemail()) && b.equals(r.getPassword()))
			{	if(("admin").equals(r.getUser()))
				{
				return 1;
				}}
		}

		for (registerBean r : regist) {
			if ( a.equals(r.getemail() ) && b.equals(r.getPassword())) {
				
				return r.getId();
				
				}
		}

		

		return 0;
	}
	
	
	
	
	
	public registerBean retrieveregister(int id) {
		for (registerBean r : regist) {
			if (r.getId() == id)
				return r;
		}
		return null;
	}
	

	public boolean correct(registerBean register) {

		return true;
	}
}
