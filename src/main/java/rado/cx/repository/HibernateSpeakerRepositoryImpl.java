package rado.cx.repository;

import rado.cx.model.Speaker;
import rado.cx.repository.SpeakerRepository;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Rado");
        speaker.setLastName("Tzenev");

        speakers.add(speaker);

        return speakers;
    }
}
