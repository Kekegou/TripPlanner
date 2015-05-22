/*
 * Team 4
 * Task 13
 * Date: May 214, 2015
 * Only for educational use
 */
package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import model.Model;

public class ExploreAction extends Action {

	public ExploreAction(Model model) {
		
	}

	public String getName() {
		return "explore.do";
	}

	public String perform(HttpServletRequest request) {
		List<String> errors = new ArrayList<String>();
		request.setAttribute("errors", errors);

		
		return "explore.jsp";
	}
}