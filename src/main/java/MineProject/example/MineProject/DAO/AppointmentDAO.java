package MineProject.example.MineProject.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import MineProject.example.MineProject.PojoClasses.AppointmentVO;
import jakarta.transaction.Transactional;

@Repository
public class AppointmentDAO {

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public List<Object> getAppointmentList() {
		
		String toGetAppointmentList = "select appointment_id,a.patient_id,p.first_name from appointments a join patient p on p.patient_id = a.patient_id";	
		
		 
		return namedParameterJdbcTemplate.query(toGetAppointmentList, this::getAppointmentListFunction);
		
	}
	
	private Object getAppointmentListFunction(ResultSet rs,int i) throws SQLException {
		
		AppointmentVO appointmentVO = new AppointmentVO();
		
		appointmentVO.setAppointment_id(rs.getInt("appointment_id"));
		appointmentVO.setPatientId(rs.getInt("patient_id"));
		appointmentVO.setPatientName(rs.getString("first_name"));
		
		return appointmentVO;
		
	}
}
