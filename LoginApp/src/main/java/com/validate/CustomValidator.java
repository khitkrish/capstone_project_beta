package com.validate;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.bean.registerBean;
@Component
public class CustomValidator implements Validator{


public void validate(Object obj, Errors error) {

	registerBean registorBean=(registerBean)obj;
ValidationUtils.rejectIfEmptyOrWhitespace(error,"firstname","error.firstname","First Name cannot be blank");
ValidationUtils.rejectIfEmptyOrWhitespace(error,"lastname","error.lastname","Last Name cannot be blank");

String phone=registorBean.getNum();
if(!(phone.length()==10))
{
error.rejectValue("num","error.num","Conatact Number should be of 10 digits/ Contact Number should not be blank");
}
ValidationUtils.rejectIfEmptyOrWhitespace(error,"email","error.email","Date of birth cannot be blank");
 
ValidationUtils.rejectIfEmptyOrWhitespace(error,"password","error.password","Password cannot be blank");
ValidationUtils.rejectIfEmptyOrWhitespace(error,"confirmpass","error.confirmpass","Password  cannot be blank");





if(!(registorBean.getPassword().equals(registorBean.getConfirmpass())))
{
error.rejectValue("password","error.password","Password should be in proper format, Use 8 letters and one special Character ");
error.rejectValue("confirmpass", "error.confirmpass", "Password should be match as previous");
}
/*
if(!(registorBean.isStatus()))
{
error.rejectValue("status","error.status","please agree to the terms and conditions");
} */   

}     
public void valid(Object obj, Errors error) {

	
	
}





public boolean supports(Class<?> arg0) {

return false;
}


}