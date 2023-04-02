package com.example.simpleproject.service;

import com.example.simpleproject.dto.MemberDTO;
import com.example.simpleproject.entity.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MemberService {
    Member saveMember(Member member);
    Member updateMember(Member member);
    List<Member> getAllMember();
    Member getMemberById(String id);
    List<Member> createAllMember(List<Member> members);
    void deleteMember(String id);
    Page<Member> getMemberPage(Pageable pageable, MemberDTO memberDTO);
//    List<Customer> searchCustomer(String customerName);

}
