package MineProject.example.MineProject.Controller;

import org.springframework.web.bind.annotation.RestController;

import MineProject.example.MineProject.Service.AppointmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage.Body;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Appointments {

	@Autowired
	private AppointmentService appointmentService;
	
	@GetMapping("/getAppointmentList")
	public ResponseEntity<?> getAppointmentList() {
		
		
		return ResponseEntity.ok(appointmentService.getAppointmentList());
	}
	
}
