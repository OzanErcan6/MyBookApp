package com.ercan.MyBookApp.jpaRepository;

import com.ercan.MyBookApp.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface BookJpaRepository extends JpaRepository<Book, Long> {
    List<Book> findByWriter(String writer);
//    List<Book> deleteById(int id);
//    List<Book> findByNameOrderByIdDesc(String name);
//    List<Book> findByNameAndId(String name, Long id);
//    Long countByName(String name);

//    @Query("Select c from Course c where c.name like '%ders%'")
//    List<Book> findLikeDers();
//
//    @Query(value = "Select * from Course where name like '%ders%'", nativeQuery = true)
//    List<Book> findLikeDersNativeQuery();
//
//    @Query(name = "query_get_ders")
//    List<Book> findLikeDersUsingNamedQuery();

}

