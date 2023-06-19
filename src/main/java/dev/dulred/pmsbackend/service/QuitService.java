package dev.dulred.pmsbackend.service;

import dev.dulred.pmsbackend.entity.Quit;

import java.util.Map;

public interface QuitService {
    String addQuit(Quit quit);
    Map<String, Object> getQuit(Quit quit);
    Map<String, Object> selectQuitsByCon(Quit quit);
}
