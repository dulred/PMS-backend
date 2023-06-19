package dev.dulred.pmsbackend.repository;

import dev.dulred.pmsbackend.entity.Quit;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuitRepository {
    int addQuit(Quit quit);
    List<Quit> selectQuitStaff(Quit quit);
    List<Quit> selectQuitsByCon(Quit quit);
}
