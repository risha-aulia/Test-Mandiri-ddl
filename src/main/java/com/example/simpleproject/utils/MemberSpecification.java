package com.example.simpleproject.utils;

import com.example.simpleproject.dto.MemberDTO;
import com.example.simpleproject.entity.Member;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MemberSpecification {
    public static Specification<Member> getSpecification(MemberDTO memberDTO){
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();
            if (memberDTO.getMemberEmail() != null && !memberDTO.getMemberEmail().equals("")){
                Predicate memberNamePredicate = (Predicate) criteriaBuilder.like(criteriaBuilder.lower(root.get("memberEmail")),
                        "%" + memberDTO.getMemberEmail().toLowerCase()+ "%");
                predicates.add(memberNamePredicate);
            }
            javax.persistence.criteria.Predicate[] arrayPredicates = (javax.persistence.criteria.Predicate[]) predicates
                    .toArray(new javax.persistence.criteria.Predicate[predicates.size()]);
            return criteriaBuilder.and(arrayPredicates);
        };
    }

}
