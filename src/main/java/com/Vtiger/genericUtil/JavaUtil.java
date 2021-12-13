package com.Vtiger.genericUtil;

import java.util.Random;

import com.github.javafaker.Faker;

public class JavaUtil {
	
	private  JavaUtil() {
		
	}
public static  JavaUtil ObjectforJavaUtil()
{
	 JavaUtil jv=new  JavaUtil();
	 return jv;
}
/**
 * @author Venkat
 * Description:This Method used to generate random number
 * 
 * @return random number
*/
public int generateRandomNumber() {
Random re= new Random();
return re.nextInt(1000);
}
/**
 * @author Venkat
 * Description:This method used to generate random name
 * @return random name
 */
public String getFullName() {
	Faker faker=new Faker();
	return faker.name().fullName();
}
/**
 * @author Venkat
 * Description: this method gets 1st name randomly
 * @return random first name
 */

public String getFirstName() {
	Faker faker=new Faker();
	return faker.name().firstName();
}
/**
 * @author Venkat
 * Description:gets last name randomly
 * @return random last name
 */

public String getLastName() 
{
	Faker faker=new Faker();
	return faker.name().lastName();
}
public String getphonnumber() 
{
	Faker faker=new Faker();
	return faker.phoneNumber().cellPhone();
}
}
