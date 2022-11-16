package com.vti.repository;

import com.vti.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IDepartmentRepository extends JpaRepository<Department, Integer> {
    //    @Query("FROM Department WHERE name = :name")
    //   @Query(value = "SELECT * FROM Department WHERE name = :name", nativeQuery = true)
    //   @Query(value = "FROM Department WHERE name = ?1")
    Department findByName(String name);
    List<Department> findByTotalMembersGreaterThanEqual(int minTotalMembers);

    List<Department> findByNameAndTotalMembersGreaterThanEqualAndTotalMembersLessThanEqual(
            String name,
            int minTotalMembers,
            int maxTotalMembers
    );
    @Modifying
    @Query("DELETE FROM Department WHERE name")
    void deleteByName(String name);
}
