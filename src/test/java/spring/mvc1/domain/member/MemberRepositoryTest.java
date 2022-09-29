package spring.mvc1.domain.member;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MemberRepositoryTest {

    MemberRepository memberRepository = MemberRepository.getInstance();

    @AfterEach
    void afterEach() {
        memberRepository.clearStore();
    }

    @Test
    void save() {
        //  given
        Member member = new Member("hello", 20);
        //  when
        Member savedMember = memberRepository.save(member);

        //  then
        Member findMember = memberRepository.findById(member.getId());
        assertThat(findMember).isEqualTo(savedMember);
    }

    @Test
    void findAll() {
        //  given
        Member member1 = new Member("hello", 20);
        Member member2 = new Member("hello", 30);

        //  when
        memberRepository.save(member1);
        memberRepository.save(member2);

        //  then
        assertThat(memberRepository.findAll().size()).isEqualTo(2);
        assertThat(memberRepository.findAll()).contains(member1);
        assertThat(memberRepository.findAll()).contains(member2);
    }
}