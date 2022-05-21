package ife.backend.local.services;

import java.io.FileInputStream;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

@Service
public class FirebaseInitialize {
	
	
	@PostConstruct
    public void initialize() {
        try {
            FileInputStream serviceAccount =
                    new FileInputStream("./serviceAccountKey.json");
            
            FirebaseOptions options = FirebaseOptions.builder()
            		.setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .setDatabaseUrl("https://info-futbol-ecuador-b51fb.firebaseio.com/")
                    .build();

            FirebaseApp.initializeApp(options);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }	
	
}
