package helllo.servlet.web.frontcontroller.v4.controller;

import helllo.servlet.domain.member.Member;
import helllo.servlet.domain.member.MemberRepository;
import helllo.servlet.web.frontcontroller.ModelView;
import helllo.servlet.web.frontcontroller.v3.ControllerV3;
import helllo.servlet.web.frontcontroller.v4.ControllerV4;

import java.util.Map;

public class MemberSaveControllerV4 implements ControllerV4 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        String username = paramMap.get("username"); // map에다 요청파라미터 정보 넣어서 넘겨줄거다
        int age = Integer.parseInt(paramMap.get("age"));

        Member member = new Member(username, age);
        memberRepository.save(member);

       model.put("member", member);
       return "save-result";
    }
}
