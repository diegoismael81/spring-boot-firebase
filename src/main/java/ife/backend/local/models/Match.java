package ife.backend.local.models;


import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Match {

	private Team home;
	private Team away;
	private int round;
	private int number;
	private String phase;	
	private LocalDate date;
	private int status;		
	private String venue;
	
	public Match() {
		super();	
	}
		
	
	public void setVenue() {

		switch (this.home.getCode()) {		
		case ("AME"):
			this.venue = "Estadio Olímpico Atahualpa | Quito";
			break;
		case ("ASD"):
		this.venue = "Estadio Etho Vega | Santo Domingo";
		break;
		case ("CHFC"):
			this.venue = "Estadio Ciudad de Pelileo | Pelileo";
			break;
		case ("GYSC"):
			this.venue = "Estadio Modelo Alberto Spencer Herrera | Guayaquil";
			break;
		case ("NAC"):
			this.venue = "Complejo Deportivo | Tumbaco";
			break;
		case ("IDJ"):
			this.venue = "Estadio de IDV | Sangolquí";
			break;
		case ("IMB"):
			this.venue = "Estadio Olímpico | Ibarra";
			break;
		case ("LIB"):
			this.venue = "Estadio Reina del Cisne | Loja";
			break;
		case ("MFC"):
			this.venue = "Estadio Jocay | Manta";
			break;
		case ("OLM"):
			this.venue = "Estadio Fernando Guerrero Guerrero | Riobamba";
			break;
		case ("BSC"):
			this.venue = "Formativas de Barcelona | Guayaquil";
			break;
		case ("CFC"):
			this.venue = "Estadio Olímpico Atahualpa | Quito";
			break;
		case ("CSE"):
			this.venue = "Holcim Arena | Quito";
			break;
		case ("CUE"):
			this.venue = "Estadio Alejandro Serrano Aguilar | Cuenca";
			break;
		case ("DSC"):
			this.venue = "Estadio Jocay | Manta";
			break;
		case ("GCFC"):
			this.venue = "Estadio Christian Benítez Betancourt | Guayaquil";
			break;
		case ("GSC"):
			this.venue = "Estadio Jorge Andrade Cantos | Azogues";
			break;
		case ("IDV"):
			this.venue = "Estadio de IDV | Sangolquí";
			break;
		case ("LDUQ"):
			this.venue = "Estadio Rodrigo Paz Delgado | Quito";
			break;
		case ("MAC"):
			this.venue = "Estadio Bellavista | Ambato";
			break;
		case ("MRSC"):
			this.venue = "Estadio COAC Mushuc Runa | Comunidad Echaleche";
			break;
		case ("OCT"):
			this.venue = "Estadio Modelo Alberto Spencer Herrera | Guayaquil";
			break;
		case ("OSC"):
			this.venue = "Estadio 9 de Mayo | Machala";
			break;
		case ("SDA"):
			this.venue = "Estadio Gonzalo Pozo Ripalda | Quito";
			break;
		case ("TU"):
			this.venue = "Estadio Bellavista | Ambato";
			break;
		case ("UC"):
			this.venue = "Estadio Olímpico Atahualpa | Quito";
			break;
		default:
			this.venue = "Estadio Olímpico Atahualpa | Ecuador";
			break;

		}
	}	
}
