package com.example.simpleproject.controller;

import com.example.simpleproject.entity.Member;
import com.example.simpleproject.service.FilmService;
import com.example.simpleproject.service.MemberService;
import com.example.simpleproject.utils.ApiUrlConstant;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(ApiUrlConstant.MEMBER_PATH)
public class MemberController {
    MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping
    public Member saveMember(Member member){
        return memberService.saveMember(member);
    }
    @GetMapping("/list")
    public List<Member> getMember(){
        return memberService.getAllMember();
    }
    @PutMapping
    public Member updateMember(@RequestBody Member member){
        return memberService.updateMember(member);
    }
    @DeleteMapping
    public void deleteMember(@PathVariable String id){
        memberService.deleteMember(id);
    }
    @PostMapping("/list")
    public List<Member> createAllMember(@RequestBody List<Member> member){
        return  memberService.createAllMember(member);
    }
    @GetMapping
    public Member getMemberById(@PathVariable String id){
        return memberService.getMemberById(id);
    }
}
