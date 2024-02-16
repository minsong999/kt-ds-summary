package com.ktdsuniversity.edu.hr.employees;

import com.ktdsuniversity.edu.hr.DBSupporter;
import java.util.List;

public class EmployeesExplor {
	public static void main(String[] args) {
		DBSupporter dbSupporter = new DBSupporter("hr", "mmin2010");

		StringBuffer query = new StringBuffer();

		query.append("SELECT ");
		query.append("	SALARY ");
		query.append("	,PHONE_NUMBER ");
		query.append("	,MANAGER_ID ");
		query.append("	,LAST_NAME ");
		query.append("	,JOB_ID ");
		query.append("	,HIRE_DATE ");
		query.append("	,FIRST_NAME ");
		query.append("	,EMPLOYEE_ID ");
		query.append("	,EMAIL ");
		query.append("	,DEPARTMENT_ID ");
		query.append("	,COMMISSION_PCT ");
		query.append("FROM ");
		query.append("EMPLOYEES e ");

		List<EmployeesVO> employeesList = dbSupporter.selectList(query.toString(), args, EmployeesVO.class);

//		employeesList.forEach((employee) -> {
//			System.out.println(employee.toString());
//		});

		query = new StringBuffer();

		query.append("SELECT * FROM EMPLOYEES e ");
		query.append("WHERE LENGTH(FIRST_NAME) = 6 ");
		query.append("	AND JOB_ID NOT IN (?, ?) ");

		// ? 의 의미
		// ? --> Query Parameter
		// 실제 데이터베이스에서 실행될 SQL 문장의 파라미터를 전달하는 방법.
		// ?를 대신해 Binding 할 값 전달

		employeesList = dbSupporter.selectList(query.toString(), new Object[] { "IT_PROG", "'AD_VP'" },
				EmployeesVO.class);
		
		employeesList.forEach((employee) -> {
			
			System.out.println(employee.toString());
			System.out.println("=".repeat(30));
		});
	}
}
