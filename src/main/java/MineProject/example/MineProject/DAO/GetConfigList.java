package MineProject.example.MineProject.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

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
				

			List<configurationList> names = namedParameterJdbcTemplate.query(GET_CONFIG_LIST, this::getConfigListResultSet);
//			System.err.println(names.get(0).getConfigurationDesc());
//			names.forEach((lod)->System.err.println(lod.getConfigurationDesc()));
			
			List<String> srt = names.stream().map(n -> n.getConfigurationDesc()).collect(Collectors.toList());
			
			srt.forEach(System.out::println);
			
			return names;
			
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
			config.setConfigurationDesc(rs.getString("configuration_desc"));
			
			return config;
			
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}

}
