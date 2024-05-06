package com.example.Event_Register;


import com.example.Event_Register.config.MailConfig;
import com.example.Event_Register.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EventRegisterApplication implements CommandLineRunner {
	@Autowired
	private EventRepository eventRepository;
    @Autowired
	private MailConfig javaMailSender ;


	public static void main(String[] args) {
		SpringApplication.run(EventRegisterApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {


	}
   @EventListener(ApplicationReadyEvent.class)
   public void SendMail(){
		javaMailSender.javaMailSender()( toEmail"eventregister72@gmail.com",
	   subject "Event Test",
	   body "")
	   )
   }
}