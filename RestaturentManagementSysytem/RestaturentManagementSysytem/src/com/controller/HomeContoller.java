package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.entity.Branch;
import com.entity.DailyIncome;
import com.entity.MonthlyExpence;
import com.entity.Partner;
import com.entity.TodaysExpence;
import com.entity.Westage;
import com.entity.request;
import com.service.ServiceInterface;

@Controller
public class HomeContoller {
	@Autowired
	public ServiceInterface si;
	private static final String aUsername = "Amar Lad";
	private static final String aPassword = "Amar1234";
	

	@RequestMapping(value = "/pLogin")
	public String partnerLogin(@RequestParam("name") String n, @RequestParam("password") String pass, Model model) {
		try {
			Partner login = si.plogin(n, pass);
			if (login != null) {
	
				return "RData";

			} else {
				return "RestaturantOwner";
			}
		} catch (Exception e) {
			model.addAttribute("msg", "Invalid Credentials");
			return "RestaturantOwner";
		}
	}

	@RequestMapping(value = "/admin")
	public String adminLogin(@RequestParam("aUsername") String username, @RequestParam("aPassword") String password,
			Model model) {
		try {
			if (username.equals(aUsername) && password.equals(aPassword)) {
				return "AdminOptions";
			} else {
				model.addAttribute("msg", "Invalid Credentials");
				return "AdminLogin";
			}
		} catch (Exception e) {
			model.addAttribute("msg", "Invalid Credentials");
			return "AdminLogin";

		}

	}

	@RequestMapping(value = "/sDetails")
	public String saudagarP(Model model) {
		try {
		System.out.println("in control");

		Partner sPartner = si.getSPartner();
		model.addAttribute("msg", sPartner);
		return "PartnerDetail";
		
		}catch (Exception e) {
			model.addAttribute("err", "No Result Found Please Enter Valid Partner Id");
			return "Branch";
		}
	}

	
	@RequestMapping(value="/dExpense")
	public String getDailyEx(Model model) {
		try {
		List<TodaysExpence> dailyExpense = si.getDailyExpense();
		model.addAttribute("msg", dailyExpense);
		return "DailyExpence";
		}catch (Exception e) {
			model.addAttribute("err", "No Result Found Please Enter Valid Partner Id");
			return "Branch";

		}
	}
	
	@RequestMapping(value="/mExpense")
	public String getMonthlyExpence(Model model) {
		try {
		List<MonthlyExpence> expence = si.getMonthlyExpense();
		model.addAttribute("msg", expence);

		return "MonthlyExpence";
		}
		catch (Exception e) {
			model.addAttribute("err", "No Result Found Please Enter Valid Partner Id");
			return "Branch";

					}
	}
	
	
	@RequestMapping(value = "/addp")
	public String addP(@ModelAttribute Partner p, Model model) {
		try {
			si.addPartner(p);
				
			model.addAttribute("msg", "Partner Added Successfully!!!");

			return "AddPartner";
		} catch (Exception e) {
			model.addAttribute("msg", "Please enter valid data");
			return "AddPartner";
		}

	}

	@RequestMapping(value = "/in")
	public String income(
			/* @RequestParam("todaysIncome") int in, @RequestParam("datef") Date parse, */ @ModelAttribute DailyIncome d,
			Model model) {
		try {
			// DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy-mm-dd"); try {
			// LocalDate parse = LocalDate.parse(d, DateTimeFormatter.ISO_LOCAL_DATE);

			// si.saveIncome(in, parse);
			si.saveIncome(d);
			model.addAttribute("msg", "saved successfully");
			return "income";

		} catch (Exception e) {
			return "income";
		}
	}

	@RequestMapping(value = "/order")
	public String order(@ModelAttribute request r, Model model) {
		System.out.println("controller");
		
		try {
			si.send(r);
			model.addAttribute("msg", "Saved Successfully");
			return "request";


		} catch (Exception e) {
			model.addAttribute("msg", "Please enter valid data");
			return "request";

		}
	}

	@RequestMapping(value = "/westage")
	public String westage(@ModelAttribute Westage w, Model model) {
		System.out.println("controller");
		try {
				si.saveWestage(w);
			System.out.println(w);
			model.addAttribute("msg", w);

		
		return "westage";
		}catch (Exception e) {
			model.addAttribute("msg", "Please enter valid data");
			return "westage";

		}
	}

	@RequestMapping(value = "/addb")
	public String addB(@ModelAttribute Branch b, @RequestParam("partnerId") int id, Model model) {
		try {
			System.out.println("In addb controller");
			si.addBranch(b, id);
			model.addAttribute("msg", "Branch Added Successfully!!!");

			return "AddBranch";

		} catch (Exception e) {
			model.addAttribute("msg", e.getMessage());
			return "AddBranch";

		}

	}

	@RequestMapping(value = "/month")
	public String monthlyEx(@ModelAttribute MonthlyExpence mx, Model model) {
		try {
			si.monthlyExpence(mx);
			model.addAttribute("msg", "Send Successfully!!!");

			return "MonthlyData";

		} catch (Exception e) {
			model.addAttribute("msg", e.getMessage());
			return "MonthlyData";

		}
	}
	@RequestMapping(value="/bDetail")
	public String branchid(@RequestParam("pid") int bid) {
		si.storeBranchId(bid);
		return "Saudagar";
	}

	@RequestMapping(value = "/tx")
	public String todaysEx(@ModelAttribute TodaysExpence tx, Model model) {
		try {
			si.TodaysExpence(tx);
			model.addAttribute("msg", "Send Successfully!!!");

			return "TodaysExpence";

		} catch (Exception e) {
			model.addAttribute("msg", e.getMessage());
			return "TodaysExpence";

		}

	}
	
	@RequestMapping(value="/orderDis")
	public String getRequest(Model model) {
		try {
			List<request> request = si.getreq();
			model.addAttribute("msg", request);
			return "DisplayRequest";
			
		}catch (Exception e) {
			model.addAttribute("err", "No Result Found Please Enter Valid Partner Id");
			return "DisplayRequest";

		}
		
	}
	
	@RequestMapping(value="/iDetails")
	public String getIncome(Model model) {
		try {
		List<DailyIncome> income = si.getIncomeDetails();
		model.addAttribute("msg", income);

		return "IncomeDetails";
		}catch (Exception e) {
			model.addAttribute("err", "No Result Found Please Enter Valid Partner Id");
			return "Branch";
		}
	}
	
	@RequestMapping(value="/displayWestage")
	public String Westage(Model model) {
		try {
			List<Westage> westage = si.getwest();
			model.addAttribute("msg", westage);
			return "DisplayWestage";
			
		}catch (Exception e) {
			model.addAttribute("err", "No Result Found Please Enter Valid Partner Id");
			return "DisplayWestage";

		}
		
	}
}