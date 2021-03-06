package spring;

public class ChangePasswordService {

	private MemberDao memberDao;
	
	public ChangePasswordService(){}
	public ChangePasswordService(MemberDao memberDao){
		this.memberDao=memberDao;
	}
	
	public void changePassword(String email, String oldPw, String newPw){
		Member member =memberDao.selectByEmail(email);
		if(member == null){
			
		}
		
		member.changePassword(oldPw, newPw);
		memberDao.update(member);
	}
}
