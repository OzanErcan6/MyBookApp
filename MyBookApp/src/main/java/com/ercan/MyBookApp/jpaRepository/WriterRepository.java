package com.ercan.MyBookApp.jpaRepository;

import com.ercan.MyBookApp.entity.Writer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface WriterRepository extends JpaRepository<Writer, Long> {

}

