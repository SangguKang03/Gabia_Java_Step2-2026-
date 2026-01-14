package chapter15.hashmap;

import java.util.HashMap;

public class MemberHashMap {
	
	private HashMap<Integer, Member> hashMap;
	
	
	// 생성자
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
	    hashMap.put(member.memberId(), member);
	}


	public void showAllMember() {
		for(Integer key : hashMap.keySet()) {
			System.out.println(hashMap.get(key));
		}
		
	}

	public void removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
            hashMap.remove(memberId);
            System.out.println(memberId + "번 회원이 삭제되었습니다.");
        } else {
            System.out.println(memberId + "번 회원이 없습니다.");
        }
		
	}

}
