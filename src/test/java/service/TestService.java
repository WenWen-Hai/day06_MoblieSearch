package service;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wen.po.Mobile;
import com.wen.po.Stu;
import com.wen.service.MobileService;
import com.wen.service.StuService;

public class TestService {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-service.xml","spring-dao.xml");

		
		MobileService service = context.getBean(MobileService.class);
		
		Mobile m = service.search("13000000000");
		System.out.println(m);
//		List<Stu> list = service.getAllStu();
//
//		for (Stu stu : list) {
//			System.out.println(stu);
//		}
	}

}
