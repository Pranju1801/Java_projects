package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Entity.Account;
import com.service.ServiceInterface;

@Controller
public class HomeController {
	@Autowired
	public ServiceInterface si;

	@RequestMapping(value = "/log")
	public String getLogin(@RequestParam("email") String email, @RequestParam("password") String password,
			Model model) {
		try {
			Account login = si.getValidLogin(email, password);

			if (login != null) {
				return "Options";
			} else {

				return "Login";
			}
		} catch (Exception e) {
			model.addAttribute("error", "Invalid Credentials");
			return "Login";
		}

	}

	@RequestMapping(value = "/reg")
	public String getRegistration(@ModelAttribute Account ac) {
		si.setRegistration(ac);
		return "Login";

	}

	@RequestMapping(value = "/for")
	public String resetPass(@RequestParam("email") String em, @RequestParam("password") String pass) {
		si.updatePass(em, pass);
		return "Login";

	}

	@RequestMapping(value = "/with")
	public String Withdraw(@RequestParam("accountNo") String an, @RequestParam("amount") double amount, Model model) {
		System.out.println("I'm in controller");
		try {
			int withdrawAmount = si.WithdrawAmount(an, amount);
			if (withdrawAmount == 1) {
				model.addAttribute("msg", "Withdrawal Successful!!!");
				return "Withdraw";
			} else {
				model.addAttribute("msg", "Insufficient Balance!!!!");
				return "Withdraw";
			}
		} catch (Exception e) {
			model.addAttribute("msg", "Invalid Account No!!!!");
			return "Withdraw";
		}

	}

	@RequestMapping(value = "/dep")
	public String deposite(@RequestParam("accountNo") String an, @RequestParam("amount") double amount, Model model) {
		System.out.println("I'm in controller");
		try {
			si.depositeAmount(an, amount);
			model.addAttribute("msg", "Deposite Successful!!!");
			return "Login";
		}

		catch (Exception e) {
			model.addAttribute("msg", "Invalid Account No!!!!");
			return "Deposite";
		}

	}

	@RequestMapping(value = "/balance")
	public String checkBalance(@RequestParam("accountNo") String an, Model model) {
		try {
			double balance = si.checkBalance(an);

			model.addAttribute("msg", "Current Balance is :" + balance);
			return "show";

		} catch (Exception e) {
			model.addAttribute("msg", "Invalid Account No");
			return "balance";
		}

	}

	@RequestMapping(value = "/edit")
	public String Edit(@RequestParam("accountNo") String an, Model model) {
		try {
			Account details = si.updateDetails(an);

			if (details != null) {
				model.addAttribute("msg", details);
				return "Update";
			} else {
				return "Edit";
			}
		} catch (Exception e) {
			model.addAttribute("msg", "Invalid Acccount No");
			return "Edit";
		}

	}

	@RequestMapping(value = "/up")
	public String Update(@RequestParam("accountNo") String an, @RequestParam("name") String name,
			@RequestParam("username") String username, @RequestParam("email") String email,
			@RequestParam("contactNO") long cn, @RequestParam("panNo") String pn,
			@RequestParam("password") String pass,Model model) {
		try {
		    si.editDeatils(an,name,username,email,cn,pn,pass);
		    model.addAttribute("msg", "Updated Successfully!!!");
		    return "show";
		}catch (Exception e) {
			model.addAttribute("msg", "Invalid Acccount No");
			  return "Update";
		}

	}

@RequestMapping(value="del")
public String deleteAccount(@RequestParam("accountNo") String an,Model model){
	try {
	si.delete(an);
	model.addAttribute("msg", "Deleted Successfully!!!");
	return "Delete";
	}catch (Exception e) {
		model.addAttribute("msg", "Invalid Acccount No");
		return "Delete";

	}
}
}
