package com.esprit.bayremhamdi.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "test")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class test {

    @Id
private long id ;
}
