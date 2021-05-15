package hrms.hrms.api;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.Jop_PositionService;
import hrms.hrms.entities.concretes.Jop_Position;

@RestController
@RequestMapping("/api/jop_positions")
public class Jop_PositionsController {
	private Jop_PositionService jopPositionService;

	
	
	public Jop_PositionsController(Jop_PositionService jopPositionService) {
		super();
		this.jopPositionService = jopPositionService;
	}



	@GetMapping("/getall")
	public List<Jop_Position> getAll(){
		return this.jopPositionService.getAll();
		
	}
	
}
