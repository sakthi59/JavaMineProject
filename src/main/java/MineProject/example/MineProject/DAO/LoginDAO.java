package MineProject.example.MineProject.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import MineProject.example.MineProject.EntityClasses.LoginEntity;
import MineProject.example.MineProject.PojoClasses.LoginVO;

@Repository
public class LoginDAO {

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	
	private String CREATE_USER = "INSERT INTO `login_users_demo` (`user_name`, `user_password`) "
			+ "VALUES (:name,:password); ";
	
	private String GET_ALL_LOGIN_USERS_NAME= "select user_name from login_users_demo";

	
	public Integer createNewUser(LoginVO payload) {
		
		try {
			
		MapSqlParameterSource param = new MapSqlParameterSource();
		
		param.addValue("name", payload.getEmail());
		param.addValue("password", payload.getPassword());
		
		namedParameterJdbcTemplate.update(CREATE_USER, param);
		
		} catch (Exception e) {
			
			e.printStackTrace();
			return 0;
		}
		return 1;
	}
	
	public List<String> getAlluserName() {
		
		return namedParameterJdbcTemplate.queryForList(GET_ALL_LOGIN_USERS_NAME, new MapSqlParameterSource(), String.class);
	}
	
	public List<LoginEntity> getLoginDetails()
	{
		return null;
		
//		return namedParameterJdbcTemplate.queryForList("select * from login_users_demo",List<LoginEntity> s);
		
	}
	
	public int batchUpdate(LoginVO loginVO) {
		
		
		return 0;
	}
}
