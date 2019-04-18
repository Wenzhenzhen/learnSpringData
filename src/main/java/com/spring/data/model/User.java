package com.spring.data.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @description:
 * @author: 10068848
 * @create: 2019-04-18
 * /**需要引入这三个包
 *
 *    * import javax.persistence.Entity;
 *    * import javax.persistence.GeneratedValue; import
 *    * javax.persistence.Id;
 *    *
 *    */

@Data
@Entity
@Table(name = "t_user")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String firstName;

  private String lastName;
}