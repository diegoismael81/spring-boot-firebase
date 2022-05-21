package ife.backend.local.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Team {

	private String name;
	private String code;

	public Team() {
		super();
	}
	
	public void setName(String n) {
		this.name = n;
	}

	public void setName() {

		switch (code) {		
		case ("AME"):
			name = "CD América";
			break;		
		case ("ASD"):
			name = "At. Santo Domingo";
			break;
		case ("CHFC"):
			name = "Chacaritas FC";
			break;
		case ("GYSC"):
			name = "Búhos ULVR FC";
			break;		
		case ("NAC"):
			name = "CD El Nacional";
			break;
		case ("IDJ"):
			name = "Independiente Jrs";
			break;		
		case ("IMB"):
			name = "Imbabura SC";
			break;
		case ("LIB"):
			name = "Libertad FC";
			break;
		case ("MFC"):
			name = "Manta FC";
			break;
		case ("OLM"):
			name = "CD Olmedo";
			break;
		case ("BSC"):
			name = "Barcelona SC";
			break;
		case ("CFC"):
			name = "Cumbayá FC";
			break;
		case ("CSE"):
			name = "CS Emelec";
			break;
		case ("CUE"):
			name = "Deportivo Cuenca";
			break;
		case ("DSC"):
			name = "Delfín SC";
			break;
		case ("GCFC"):
			name = "Guayaquil City FC";
			break;
		case ("GSC"):
			name = "Gualaceo SC";
			break;
		case ("IDV"):
			name = "Independiente";
			break;
		case ("LDUQ"):
			name = "LDU Quito";
			break;
		case ("MAC"):
			name = "CD Macará";
			break;
		case ("MRSC"):
			name = "Mushuc Runa SC";
			break;
		case ("OCT"):
			name = "9 de Octubre FC";
			break;
		case ("OSC"):
			name = "Orense SC";
			break;
		case ("SDA"):
			name = "SD Aucas";
			break;
		case ("TU"):
			name = "Técnico Univ.";
			break;
		case ("UC"):
			name = "Univ. Católica";
			break;
		}

	}

	
}
