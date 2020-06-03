package challenge;

import javax.persistence.*;

@Table(name="scripts")
@Entity
public class Quote {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column
	private String actor;

	@Column
	private String detail;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getQuote() {
		return detail;
	}

	public void setQuote(String quote) {
		this.detail = quote;
	}

}
