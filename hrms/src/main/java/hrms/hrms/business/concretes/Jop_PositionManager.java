package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.Jop_PositionService;
import hrms.hrms.dataAccess.abstracts.Jop_PositionDao;
import hrms.hrms.entities.concretes.Jop_Position;
@Service
public class Jop_PositionManager implements Jop_PositionService {
	@Autowired
	private Jop_PositionDao jopPositionDao;
	
	public Jop_PositionManager(Jop_PositionDao jopPositionDao) {
		super();
		this.jopPositionDao = jopPositionDao;
	}

	@Override
	public List<Jop_Position> getAll() {
		
		
		return this.jopPositionDao.findAll();
	}

}
