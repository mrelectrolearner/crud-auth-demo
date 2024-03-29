package com.example.crudAuth.security;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseAuth;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;

import java.io.IOException;

@Configuration
public class FirebaseAuthConfig {
    @Value("classpath:serviceaccount.json")
    Resource serviceAccount;

    @Bean
    FirebaseAuth firebaseAuth() throws IOException {

        FirebaseOptions options = FirebaseOptions.builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount.getInputStream()))
                .build();


        FirebaseApp firebaseApp = FirebaseApp.initializeApp(options);


        return FirebaseAuth.getInstance(firebaseApp);


    }
}
