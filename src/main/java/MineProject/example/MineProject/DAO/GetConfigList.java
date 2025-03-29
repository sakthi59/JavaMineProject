package MineProject.example.MineProject.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import MineProject.example.MineProject.EntityClasses.configurationList;

@Repository
public class GetConfigList {
	
		@Autowired
	    NamedParameterJdbcTemplate namedParameterJdbcTemplate;
		
		private String GET_CONFIG_LIST = "select * from configuration_list";
		
		
		public List<configurationList> getConfigList() {
			
			try {
				

			return namedParameterJdbcTemplate.query(GET_CONFIG_LIST, this::getConfigListResultSet);
			
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
			
		}
		
		public configurationList getConfigListResultSet(ResultSet rs, int rowNum) throws SQLException {
			
			try {
				
			
			
			configurationList config = new configurationList();
			
			config.setConfigId(rs.getInt("configuration_id"));
			config.setConfigType(rs.getString("configuration_type"));
			config.setConfigInfo(rs.getString("config_info"));
			
			return config;
			
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}

}
