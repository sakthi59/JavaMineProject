package MineProject.example.MineProject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MineProject.example.MineProject.DAO.GetConfigList;
import MineProject.example.MineProject.EntityClasses.configurationList;

@Service
public class ConfigurationService {
	
	@Autowired
	GetConfigList getConfigList;
	
	public List<configurationList> getConfigList() {
		return getConfigList.getConfigList();
		
	}

}
