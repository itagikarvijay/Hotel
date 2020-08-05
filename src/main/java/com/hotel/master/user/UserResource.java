/**
 * 
 */
package com.hotel.master.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hotel.mapper.MapperClz;

/**
 * @author User
 *
 */
@Controller
//@RequestMapping("/api/users")
public class UserResource {

	@Autowired
	MapperClz<?> mapperClz;

	@Autowired
	IUserService userService;

	@GetMapping("/home")
	public String getUser(HttpServletRequest req) {
		
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		System.out.println("Authentication1");
		System.out.println(principal);

		HttpSession session = req.getSession();

		UserInfo uf = (UserInfo) session.getAttribute("userInfo");

		if (uf == null) {
		//	UserInfo user = userService.authenticate(principal);
	//		session.setAttribute("userInfo", user);
		}

//		return (UserInfo) session.getAttribute("userInfo");
		return "home";
	}
	
	@GetMapping("/login")
	public String getLogin(HttpServletRequest req, @RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout, Model model) {
		String errorMessge = null;
		if (error != null) {
			errorMessge = "Username or Password is incorrect !!";
		}
		if (logout != null) {
			errorMessge = "You have been successfully logged out !!";
		}
		model.addAttribute("errorMessge", errorMessge);
		return "login";
	}

	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping("/all")
	public ModelAndView getAll(HttpServletRequest request) {  // List<UserInfo>
		System.out.println("Context Holder");
		ModelAndView model = new ModelAndView("home");
//		try {
		System.out.println(SecurityContextHolder.getContext().getAuthentication().getName());
		HttpSession session = request.getSession(false);
		if (session == null || !request.isRequestedSessionIdValid()) {
			// comes here when session is invalid.
			System.out.println("session is invalid");
			model.addObject("message", "User has no access to the resource");
		} else {
			System.out.println("session is valid");
			model.addObject("listUser", userService.getAll());
		}
//		}catch(Exception e) {
//			return model.addObject("accessNotAllowed", "User has no access to the resource.!");
//		}
		return model;
	}

	@GetMapping("/logout")
	public String sessopnExpired(HttpServletRequest req, HttpSession session) {
		System.out.println("Session expired");
		System.out.println(SecurityContextHolder.getContext().getAuthentication().getName());
		SecurityContextHolder.clearContext();
		req.getSession().invalidate();
		return "redirect:login";
	}

	@GetMapping("/invalidateSessionUrl")
	public String invalidateSessopnExpired(HttpServletRequest req) {
		System.out.println("Session Invalidated");
		req.getSession().invalidate();
//		return "SessionExpired";
		return "redirect:login";
	}

}
