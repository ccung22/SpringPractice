package spring;

import java.util.Date;

public class MemberRegisterService {
	private MemberDao memberDao;
	
	public MemberRegisterService(){}
	public MemberRegisterService(MemberDao memberDao){
		this.memberDao=memberDao;
	}
	
	public void regist(RegisterRequest req){
		Member member=memberDao.selectByEmail(req.getEmail());
		if(member != null){ //같은 이메일주소가 있다
			//예외처리
		}

		Member newMember= new Member(req.getEmail(), req.getPassword(), req.getName(), new Date());
		memberDao.insert(newMember);
	}
}
