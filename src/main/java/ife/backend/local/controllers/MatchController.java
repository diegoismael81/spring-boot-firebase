package ife.backend.local.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import com.fasterxml.jackson.databind.deser.DataFormatReaders.Match;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ife.backend.local.dto.MatchesDTO;
import ife.backend.local.services.MatchService;

@RestController
@RequestMapping("/api")
public class MatchController {

	private final MatchService service;
	private int start = 0;

	@Autowired
    public MatchController(MatchService service) {
        this.service = service;
    }

	@PostMapping("/matches")
	public ResponseEntity<?> create(@RequestBody MatchesDTO matches) {
		try {	
			int round = matches.getRound() - 1;
			int numMatches = matches.getMatches().size();
			start = (numMatches * round) + 1;
			matches.getMatches().forEach(match -> 
			{				
				match.setDate(matches.getDate());
				match.setPhase(matches.getPhase());
				match.setRound(matches.getRound());
				match.setNumber(start);
				service.save(match);
				start++;
			});
			return ResponseEntity.status(HttpStatus.CREATED).body("All matches added!");
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex);
		}
	}	
}
