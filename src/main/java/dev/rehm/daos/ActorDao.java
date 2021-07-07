package dev.rehm.daos;

import dev.rehm.models.Actor;

import java.util.List;

public interface ActorDao {

    public List<Actor> getAllActors();
    public boolean addNewActor(Actor newActor);

}
