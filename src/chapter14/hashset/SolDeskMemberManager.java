package chapter14.hashset;

import java.util.Set;
import java.util.HashSet;

public class SolDeskMemberManager {
	
	//HashSet 공간을 이용해서 멤버정보을 관리
	private Set<SolDeskMember> members;
	
	//생성자를 통해서 객체의 메모리 확보
	public SolDeskMemberManager() {
		members = new HashSet<SolDeskMember>();
	}
	
	// 회원가입
	public void addMember(SolDeskMember member) {
		if(members.add(member)) {
			System.out.println(member.getMemberId() + "님 회원가입 완료!");
		}else {
			System.out.println(member.getMemberId() + "는(은) 이미 존재하는 아이디입니다입니다.");
		}//addMember
	}
	
	public void showAIIMember() {
		
		for(SolDeskMember member : members) {
			System.out.println(member.getMemberId()+ "님" + member.getMemberName());
		}//for
	}//showAIIMember
	
}
