package model;

public class Login {

String uname,passwd;

public String getname(){
	return uname;
	}
public void setuname(String uname){
this.uname=uname;
}
public String getpasswd(){
return passwd;
}
public void setpasswd(String passwd){
this.passwd=passwd;
}
//Business Logic
public boolean isValidLogin()
{
if(uname.equals("NIIT")&& passwd.equals("123245"))
	return true;
else
	return false;
}
}