package ife.backend.local.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MatchDTO {
    private TeamDTO home;
    private TeamDTO away;
    private int round;
    private int number;
	private String phase;
	private LocalDate date;
}
