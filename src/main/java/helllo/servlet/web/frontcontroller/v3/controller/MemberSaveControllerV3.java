package helllo.servlet.web.frontcontroller.v3.controller;

import helllo.servlet.domain.member.Member;
import helllo.servlet.domain.member.MemberRepository;
import helllo.servlet.web.frontcontroller.ModelView;
import helllo.servlet.web.frontcontroller.v3.ControllerV3;

import java.util.Map;

public class MemberSaveControllerV3 implements ControllerV3 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelView process(Map<String, String> paraMap) {
        String username = paraMap.get("username"); // map에다 요청파라미터 정보 넣어서 넘겨줄거다
        int age = Integer.parseInt(paraMap.get("age"));

        Member member = new Member(username, age);
        memberRepository.save(member);

        ModelView mv = new ModelView("save-result");
        mv.getModel().put("member", member);

        return mv;
    }
}
