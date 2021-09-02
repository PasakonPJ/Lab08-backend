package se331.lab.rest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import se331.lab.rest.dao.OrganizerDao;
import se331.lab.rest.entity.Event;
import se331.lab.rest.entity.Organizer;
import se331.lab.rest.repository.EventRepository;
import se331.lab.rest.repository.OrganizerRepository;
@Component
public class InitOrganizer implements ApplicationListener<ApplicationReadyEvent> {
    @Autowired
    OrganizerRepository organizerRepository;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        organizerRepository.save(Organizer.builder()
                .name("Edmund Downs")
                .address("3653 Black Oak Hollow Road")
                .build());
        organizerRepository.save(Organizer.builder()
                .name("Russell Pace")
                .address("3215 Giraffe Hill Drive")
                .build());
        organizerRepository.save(Organizer.builder()
                .name("Oscar Conner")
                .address("3558 Kembery Drive")
                .build());
        organizerRepository.save(Organizer.builder()
                .name("Ballard Hobbs")
                .address("2698 Mutton Town Road")
                .build());
        organizerRepository.save(Organizer.builder()
                .name("Ballard Hobbs")
                .address("2698 Mutton Town Road")
                .build());
        organizerRepository.save(Organizer.builder()
                .name("Ballard Hobbs")
                .address("2698 Mutton Town Road")
                .build());
        organizerRepository.save(Organizer.builder()
                .name("Ballard Hobbs")
                .address("2698 Mutton Town Road")
                .build());
    }
}

