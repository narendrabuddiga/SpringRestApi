package com.api.restApi.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
// @Table(name = "roles")
public class Role {
//   @Id
//   @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

//   @Enumerated(EnumType.STRING)
//   @Column(length = 20)
  private ERole name;

}