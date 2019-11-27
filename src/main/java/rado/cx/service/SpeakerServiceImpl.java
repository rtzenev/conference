package rado.cx.service;

import rado.cx.model.Speaker;
import rado.cx.repository.HibernateSpeakerRepositoryImpl;
import rado.cx.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();

    }
}
