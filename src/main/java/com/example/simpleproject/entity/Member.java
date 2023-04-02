package com.example.simpleproject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "mst_member")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Member {
    @Id
    @Column(name = "member_id")
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;

    @Column(nullable = false)
    private String fullName;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private Date birthDate;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String phone;

}
