package Servlets;

import Crud.Lab2CrudInterface;
import mock.Lab2CrudMock;

public class ServletConfig implements ServletConfigInterface {

	@Override
	public Lab2CrudInterface GetCrud() {
		// TODO Auto-generated method stub
		return new Lab2CrudMock();
	}

}
