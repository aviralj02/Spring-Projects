package ncu.SpringEmployeeJDBC.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ncu.SpringEmployeeJDBC.Service.EmployeeService;
import ncu.SpringEmployeeJDBC.entity.Employee;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService empService;

	@ModelAttribute(value = "employee")
	public Employee getEmployee() {
		return new Employee();
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String getForm() {
		return "employee-form";
	}

	@RequestMapping(value = "/processForm", method = RequestMethod.POST)
	public String processForm(@ModelAttribute("employee") Employee emp, HttpServletResponse res) {
		empService.createRecord(emp);
		try {
			res.sendRedirect("/SpringEmployeeJDBC/display");
		} catch (IOException e) {
			e.printStackTrace();
		}

		return "confirmation";
	}

	@RequestMapping(value = "/display", method = RequestMethod.GET)
	public String getInfo(Model model) {
		List<Employee> employees = empService.loadEmployees();
		model.addAttribute("employees", employees);

		return "display";
	}

	@RequestMapping(value = "/deleteRecord", method = RequestMethod.GET)
	public void deleteRecord(@RequestParam(value = "empId") int empId, HttpServletResponse res) {
		empService.deleteRecord(empId);
		try {
			res.sendRedirect("/SpringEmployeeJDBC/display");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@RequestMapping(value = "/updateForm")
	public String updateRecord(@RequestParam(value = "empId") int empId, Model model) {
		Employee emp = empService.fetchEmployee(empId);
		model.addAttribute("emp", emp);

		return "update-form";
	}

	@RequestMapping(value = "/processUpdate", method = RequestMethod.POST)
	public String processUpdate(@ModelAttribute("emp") Employee emp) {
		empService.updateRecord(emp, emp.getEmployee_id());

		return "confirmation";
	}

	@RequestMapping(value = "/batchProcess", method = RequestMethod.POST)
	public String batchProcessOperation() {
		List<Employee> emps = empService.loadEmployees();
		empService.batchInsertRecord(emps);
		
		return "confirmation";
	}
}
