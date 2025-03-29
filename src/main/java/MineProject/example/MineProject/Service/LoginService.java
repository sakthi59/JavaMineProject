package MineProject.example.MineProject.Service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MineProject.example.MineProject.DAO.LoginDAO;
import MineProject.example.MineProject.PojoClasses.LoginVO;

@Service
public class LoginService {

	@Autowired
	private LoginDAO loginDAO;
	
	
	public Integer createNewUser(LoginVO payload) {
		
		Integer checkDupplicateUserName = this.checkDupplicateUserName(payload);
		
		System.err.println(checkDupplicateUserName);
		
		if (checkDupplicateUserName == 1) {
			return loginDAO.createNewUser(payload);
		}else {
			return 2;
		}
	}
	
	public Integer checkDupplicateUserName(LoginVO paylod) {
		
		List<String> allUsersName = loginDAO.getAlluserName();
		
		for (String name : allUsersName) {
			
			if (paylod.getEmail().equalsIgnoreCase(name)) {
				return 0;
			}
		}
		
		return 1;
		
	}
	
}
