package servlets;

//import crud.FileCrud;
import crud.CrudInterface;
import crud.FileCrud;
//import mock.Lab2CrudMock;

public class ServletConfig implements ServletConfigInterface {

	CrudInterface l2ci;

	public ServletConfig() {
		this.l2ci = new FileCrud();
	}

	public void setL2ci(CrudInterface l2ci) {
		this.l2ci = l2ci;
	}


	@Override
	public CrudInterface GetCrud() {
		// TODO Auto-generated method stub
		return l2ci;
	}

}
