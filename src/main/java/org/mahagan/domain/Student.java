/**
 * Created By VijayKumar Mohite
 * Date : 7/30/2023
 * Time : 3:50 PM
 * Project : RESTAPI-Crud-Operation
 **/

package org.mahagan.domain;

import jakarta.persistence.*;
// This is my first RESTAPI Application.
@Entity//Represent whole domain class
@Table(name = "tbl_student")//create a table in database
public class Student {
    @Id//Its primary key of table
    @GeneratedValue(strategy = GenerationType.AUTO)//Auto increment primary value in table.
    private int id;
    private String firstName;
    private String lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
