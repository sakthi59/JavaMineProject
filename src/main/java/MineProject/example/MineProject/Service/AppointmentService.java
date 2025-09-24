package MineProject.example.MineProject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MineProject.example.MineProject.DAO.AppointmentDAO;
import MineProject.example.MineProject.PojoClasses.AppointmentVO;

@Service
public class AppointmentService {

	@Autowired
	private AppointmentDAO appointmentDAO;
	
	public List<Object> getAppointmentList() {
		
		return appointmentDAO.getAppointmentList();
		
	}
}
