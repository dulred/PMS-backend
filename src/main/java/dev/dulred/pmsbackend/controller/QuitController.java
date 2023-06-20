package dev.dulred.pmsbackend.controller;

import dev.dulred.pmsbackend.entity.Quit;
import dev.dulred.pmsbackend.service.QuitService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class QuitController {
    @Resource
    private QuitService quitService;
    @PostMapping("/addQuit")
    public  String addQuit(@RequestBody Quit quit){
        return quitService.addQuit(quit);
    }
    @GetMapping("/getQuit")
    public Map<String, Object> getQuit(Quit quit){
        return quitService.getQuit(quit);
    }
    @PostMapping("/selectQuitsByCon")
    public Map<String, Object> selectQuitsByCon(@RequestBody Quit quit){

        System.out.println(quit.toString());
        return quitService.selectQuitsByCon(quit);
    }
}
