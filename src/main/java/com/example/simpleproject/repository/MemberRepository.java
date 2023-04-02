package com.example.simpleproject.repository;

import com.example.simpleproject.entity.Film;
import com.example.simpleproject.entity.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, String>  {
    List<Film> findMemberByMemberEmail(String emailCriteria);

    Page<Member> findAll(Specification<Member> memberSpecification, Pageable pageable);
}
