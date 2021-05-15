package hrms.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="jop_position")
public class Jop_Position {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="position")
	private String position;
}
