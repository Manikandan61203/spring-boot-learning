package com.example.ManyToOne.Repository;

import com.example.ManyToOne.Model.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepo extends JpaRepository<Library,Integer> {
}
