package MineProject.example.MineProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import MineProject.example.MineProject.EntityClasses.configurationList;
import MineProject.example.MineProject.Service.ConfigurationService;

@RestController
@RequestMapping("/config")
public class ConfigurationController {
	
	@Autowired
	ConfigurationService configurationService;
	
	@GetMapping("/getConfigurationList")
	public List<configurationList> getConfigurationList()
	{
		System.err.println("Started");
		try {
			
		
		return configurationService.getConfigList();
		
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
