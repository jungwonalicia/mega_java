package com.mega.mvc03;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//�Ϲ� �ڹ� ����: POJO(Plain Old Java Object)
//Controller����� ���� Ŭ������ ����� ������, ���!!
//@Controller ������̼��� ����, ���������� �������� ��
//1) ���
//2) �ڵ巯���ۿ� Ű:���� ���, Ű)��û�Ǵ� �ּ�, ��)��ü�� �޼���

@Controller
public class CarController {

	//��Ʈ�ѷ����� view���� �Ѿ�� ���� �׸�:
	//1. view������ ����, 2. model�� �Ӽ���
	@RequestMapping("car.do")
	public String car(String color, Model model) {
		System.out.println("��Ʈ�ѷ����� ���� ���� " + color);
		model.addAttribute("color", color);
		return "img";
	}
}
