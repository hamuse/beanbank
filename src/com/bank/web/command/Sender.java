package com.bank.web.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bank.web.pool.Constants;

public class Sender {//�ȿ� ���빰�� ������� Ŭ������ Ŭ���� ��ü�̴�. 
	public static void forward( HttpServletRequest request,HttpServletResponse response) {
		try {
			request.getRequestDispatcher(Receiver.cmd.getView())
			.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
}
