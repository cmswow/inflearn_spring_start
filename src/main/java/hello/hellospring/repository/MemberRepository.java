package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    Member save(Member member); // 저장
    Optional<Member> findById(Long id); // 아이디찾기
    Optional<Member> findByName(String name); // 이름찾기
    List<Member> findAll(); // 지금까지의 모든 데이터를 불러오기

}
