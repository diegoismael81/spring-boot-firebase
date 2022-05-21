package ife.backend.local.services.impl;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import ife.backend.local.dto.MatchDTO;
import ife.backend.local.models.Match;
import ife.backend.local.services.MatchService;

@Service
public class MatchServiceImpl implements MatchService {

	private final ModelMapper mapper;
	
	@Autowired
	public MatchServiceImpl(ModelMapper mapper) {
		this.mapper = mapper;		
	}

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public void save(MatchDTO matchDTO) {
		DatabaseReference dbRef = FirebaseDatabase.getInstance().getReference().child("matches");		
		Match match = mapper.map(matchDTO, Match.class);
		match.getHome().setName();
		match.getAway().setName();
		match.setVenue();	
		dbRef.push().setValue(match, (error, ref) -> {
			if (error != null) {
				throw error.toException();
			} else {
				logger.info("Match added with key " + ref.getKey());
			}
		});			
	}	
}
