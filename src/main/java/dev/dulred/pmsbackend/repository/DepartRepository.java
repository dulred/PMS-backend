package dev.dulred.pmsbackend.repository;

import dev.dulred.pmsbackend.entity.Depart;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartRepository {
    List<Depart>  selectDepart();
}
