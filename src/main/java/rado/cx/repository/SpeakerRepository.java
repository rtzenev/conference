package rado.cx.repository;

import rado.cx.model.Speaker;

import java.util.List;

public interface SpeakerRepository {

    public List<Speaker> findAll();
}
