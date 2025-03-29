package MineProject.example.MineProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import MineProject.example.MineProject.PojoClasses.ApiResponse;
import MineProject.example.MineProject.PojoClasses.LoginVO;
import MineProject.example.MineProject.Service.LoginService;

@RestController
@CrossOrigin("http://localhost:4200")
public class LoginController {
	
	@Autowired
	private LoginService loginService;

	@GetMapping("validate-users-login")
	public ResponseEntity<?> ValidateUsersLogin()
	{
	
		
		return null;
	}
	
	@PostMapping("create-new-user")
	public ResponseEntity<?> createNewUser(@RequestBody LoginVO payload)
	{
		
		System.err.println(payload.getEmail()+"::"+ payload.getPassword());
	
		Integer response = loginService.createNewUser(payload);
		
		if (response == 1) {
			return ResponseEntity.ok(new ApiResponse("Sucessfully",200,"new user create sucessfully"));
		}if (response == 2) {
			return ResponseEntity.ok(new ApiResponse("Failed",404,"user name is already exiest"));
		}else {
			return ResponseEntity.ok(new ApiResponse("Failed",500,"some thing is wrong"));
		}
		
	}
}
