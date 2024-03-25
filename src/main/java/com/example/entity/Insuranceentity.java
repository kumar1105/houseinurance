package com.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="insurance2")
public class Insuranceentity {
	 @Id
	    @GeneratedValue
	    private int id;
	    @Column(nullable = false)
	    private String holdername;
	    @Column(nullable = false)
	    private int propertyvalue;
	    @Column(nullable = false)
	    private String location;
	    @Column(nullable = false)
	    private String coveragetype;
	    @Column(nullable = false)
	    private int tenure;

}
