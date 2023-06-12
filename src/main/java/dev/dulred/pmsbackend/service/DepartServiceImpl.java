package dev.dulred.pmsbackend.service;

import dev.dulred.pmsbackend.entity.Depart;
import dev.dulred.pmsbackend.repository.DepartRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class DepartServiceImpl implements DepartService {
    @Resource
    DepartRepository departRepository;
    @Override
    public List<Depart> selectDepart() {
        return  departRepository.selectDepart();
    }
}
