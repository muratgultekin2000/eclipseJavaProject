package hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.Jop_Position;

public interface Jop_PositionDao extends JpaRepository<Jop_Position,Integer>{

}
