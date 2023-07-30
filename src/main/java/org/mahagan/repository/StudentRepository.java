/**
 * Created By VijayKumar Mohite
 * Date : 7/30/2023
 * Time : 3:54 PM
 * Project : RESTAPI-Crud-Operation
 **/
package org.mahagan.repository;

import org.mahagan.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository/* class provide the mechanism for storage,retrieval,search.update and delete operation on objects */
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
