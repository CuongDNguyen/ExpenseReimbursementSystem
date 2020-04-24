package com.cuongdnguyen.managestaff.repository;

import com.cuongdnguyen.managestaff.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}