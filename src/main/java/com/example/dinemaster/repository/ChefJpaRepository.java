/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.data.jpa.repository.JpaRepository;
 * import org.springframework.stereotype.Repository;
 * 
 */

// Write your code here

package com.example.dinemaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;
import com.example.dinemaster.model.Chef;

public interface ChefJpaRepository extends JpaRepository<Chef, Integer> {
}
