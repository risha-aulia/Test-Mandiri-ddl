package com.example.simpleproject.service.impl;

import com.example.simpleproject.dto.MemberDTO;
import com.example.simpleproject.entity.Member;
import com.example.simpleproject.repository.MemberRepository;
import com.example.simpleproject.service.MemberService;
import com.example.simpleproject.utils.MemberSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    MemberRepository memberRepository;
    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    @Override
    public Member saveMember(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public Member updateMember(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public List<Member> getAllMember() {
        return memberRepository.findAll();
    }

    @Override
    public Member getMemberById(String id) {
        return memberRepository.findById(id).get();
    }

    @Override
    public List<Member> createAllMember(List<Member> members) {
        return memberRepository.saveAll(members);
    }

    @Override
    public void deleteMember(String id) {
        memberRepository.deleteById(id);
    }

    @Override
    public Page<Member> getMemberPage(Pageable pageable, MemberDTO memberDTO) {
        Specification<Member> memberSpecification = MemberSpecification.getSpecification(memberDTO);
        return memberRepository.findAll(memberSpecification, pageable);
    }
}
