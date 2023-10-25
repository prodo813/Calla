package project.spring.calla.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.spring.calla.domain.FBoardReplyVO;
import project.spring.calla.domain.MemberVO;
import project.spring.calla.persistence.MemberDAO;


@Service
public class MemberServiceImple implements MemberService {
		private static final Logger logger = 
				LoggerFactory.getLogger(MemberServiceImple.class);

    
	@Autowired
	private MemberDAO MemberDAO;
  
	@Override
	public int create(MemberVO vo) { 
		logger.info("create() 호출 : vo = " + vo.toString());
		return MemberDAO.insert(vo); 
		
	}
	
	@Override
	public int checkId(String memberId) { // 
		int result = 0;
        result = MemberDAO.checkId(memberId);
		return result;
	}
	
	@Override
	public int checkNick(String memberNickname) { // 
		int result = 0;
        result = MemberDAO.checkNickname(memberNickname);
		return result;
	}
	  
	 
	   




	@Override
	public MemberVO read(String memberId) {
		logger.info("read(memberId) 호출 memberId : " + memberId);
		return MemberDAO.select(memberId);
	}

	@Override
	public int update(MemberVO vo) {
		logger.info("update() 호출 vo : " + vo.toString());
		return MemberDAO.update(vo);
	}

	
}
