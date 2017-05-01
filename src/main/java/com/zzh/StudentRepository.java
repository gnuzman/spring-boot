package com.zzh;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zzh on 2017/4/30.
 */
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
