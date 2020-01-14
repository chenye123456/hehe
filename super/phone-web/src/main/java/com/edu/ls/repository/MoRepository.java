package com.edu.ls.repository;

import com.edu.ls.pojo.Mo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MoRepository extends JpaRepository<Mo,Integer> {


}
