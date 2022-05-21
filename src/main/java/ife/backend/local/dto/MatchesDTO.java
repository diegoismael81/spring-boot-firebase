package ife.backend.local.dto;

import java.time.LocalDate;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MatchesDTO {
	
	private int round;
	private String phase;
	private LocalDate date;
	private List<MatchDTO> matches;
	
	public MatchesDTO() {
		super();	
	}	
}
