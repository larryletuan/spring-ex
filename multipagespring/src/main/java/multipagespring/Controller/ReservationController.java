package multipagespring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import multipagespring.Model.Reservation;

@RequestMapping("/reservation")
@Controller
public class ReservationController {
	@RequestMapping("/bookingForm")
	public String processBookingForm(Model model)
	{
		Reservation reservation = new Reservation();
		model.addAttribute("reservation",reservation);
		return  "reservation-page";
	}
	@RequestMapping("/submitForm")
	public String processConfirmForm(@ModelAttribute("reservation") Reservation res)
	{

		return "confirmation-form";  

	}
}
