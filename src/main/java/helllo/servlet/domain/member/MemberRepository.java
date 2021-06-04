package helllo.servlet.domain.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    private static final MemberRepository instance = new MemberRepository();

    public static MemberRepository getInstance(){  //무조건 getInstance로만 조회가 된다.
        return instance;
    }
    private MemberRepository(){} // 싱글톤으로 만들때는 private으로 생성자 만들어서 아무나 생성못하게 한다.


    public Member save(Member member){
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    public Member findById(Long id) {
        return store.get(id);
    }

    public List<Member>findAll(){
        return new ArrayList<>(store.values()); //store에 있는 모든 값들을 꺼내서 새로운 Arraylist에 담에서 return
    }

    public void clearStore(){
        store.clear();
    }




}
